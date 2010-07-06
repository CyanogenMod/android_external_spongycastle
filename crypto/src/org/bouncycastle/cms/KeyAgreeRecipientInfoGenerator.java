package org.bouncycastle.cms;

import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cms.KeyAgreeRecipientInfo;
import org.bouncycastle.asn1.cms.OriginatorIdentifierOrKey;
import org.bouncycastle.asn1.cms.OriginatorPublicKey;
import org.bouncycastle.asn1.cms.RecipientInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;

public abstract class KeyAgreeRecipientInfoGenerator
    implements RecipientInfoGenerator
{
    private ASN1ObjectIdentifier keyAgreementOID;
    private ASN1ObjectIdentifier keyEncryptionOID;
    private SubjectPublicKeyInfo originatorKeyInfo;

    protected KeyAgreeRecipientInfoGenerator(ASN1ObjectIdentifier keyAgreementOID, SubjectPublicKeyInfo originatorKeyInfo, ASN1ObjectIdentifier keyEncryptionOID)
    {
        this.originatorKeyInfo = originatorKeyInfo;
        this.keyAgreementOID = keyAgreementOID;
        this.keyEncryptionOID = keyEncryptionOID;
    }

    public RecipientInfo generate(byte[] contentEncryptionKey)
        throws CMSException
    {
        OriginatorIdentifierOrKey originator = new OriginatorIdentifierOrKey(
                createOriginatorPublicKey(originatorKeyInfo));

        ASN1EncodableVector params = new ASN1EncodableVector();
        params.add(keyEncryptionOID);
        params.add(DERNull.INSTANCE);
        AlgorithmIdentifier keyEncAlg = new AlgorithmIdentifier(keyEncryptionOID, DERNull.INSTANCE);
        AlgorithmIdentifier keyAgreeAlg = new AlgorithmIdentifier(keyAgreementOID, keyEncAlg);

        ASN1Sequence recipients = generateRecipientEncryptedKeys(keyAgreeAlg, keyEncAlg, contentEncryptionKey);
        ASN1Encodable userKeyingMaterial = getUserKeyingMaterial();

        if (userKeyingMaterial != null)
        {
            return new RecipientInfo(new KeyAgreeRecipientInfo(originator, new DEROctetString(getUserKeyingMaterial()),
                keyAgreeAlg, recipients));
        }
        else
        {
            return new RecipientInfo(new KeyAgreeRecipientInfo(originator, null,
                keyAgreeAlg, recipients));
        }
    }

    protected OriginatorPublicKey createOriginatorPublicKey(SubjectPublicKeyInfo originatorKeyInfo)
    {
        return new OriginatorPublicKey(
            new AlgorithmIdentifier(originatorKeyInfo.getAlgorithmId().getAlgorithm(), DERNull.INSTANCE),
            originatorKeyInfo.getPublicKeyData().getBytes());
    }

    protected abstract ASN1Sequence generateRecipientEncryptedKeys(AlgorithmIdentifier keyAgreeAlgorithm, AlgorithmIdentifier keyEncAlgorithm, byte[] contentEncryptionKey)
        throws CMSException;

    protected abstract ASN1Encodable getUserKeyingMaterial();

}