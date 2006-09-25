package org.bouncycastle.cms;

import java.util.Map;
import java.util.HashMap;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Signature;

import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;

class CMSSignedHelper
{
    static final CMSSignedHelper INSTANCE = new CMSSignedHelper();

    private static final Map     encryptionAlgs = new HashMap();

    static 
    {
        encryptionAlgs.put(X9ObjectIdentifiers.id_dsa_with_sha1.getId(), "DSA");
        encryptionAlgs.put(X9ObjectIdentifiers.id_dsa.getId(), "DSA");
        encryptionAlgs.put(OIWObjectIdentifiers.dsaWithSHA1.getId(), "DSA");
        encryptionAlgs.put(PKCSObjectIdentifiers.rsaEncryption.getId(), "RSA");
        encryptionAlgs.put(PKCSObjectIdentifiers.sha1WithRSAEncryption.getId(), "RSA");
        encryptionAlgs.put(TeleTrusTObjectIdentifiers.teleTrusTRSAsignatureAlgorithm, "RSA");
        encryptionAlgs.put(X509ObjectIdentifiers.id_ea_rsa.getId(), "RSA");
        encryptionAlgs.put(CMSSignedDataGenerator.ENCRYPTION_ECDSA, "ECDSA");
        encryptionAlgs.put(X9ObjectIdentifiers.ecdsa_with_SHA2.getId(), "ECDSA");
        encryptionAlgs.put(X9ObjectIdentifiers.ecdsa_with_SHA224.getId(), "ECDSA");
        encryptionAlgs.put(X9ObjectIdentifiers.ecdsa_with_SHA256.getId(), "ECDSA");
        encryptionAlgs.put(X9ObjectIdentifiers.ecdsa_with_SHA384.getId(), "ECDSA");
        encryptionAlgs.put(X9ObjectIdentifiers.ecdsa_with_SHA512.getId(), "ECDSA");
        encryptionAlgs.put(CMSSignedDataGenerator.ENCRYPTION_RSA_PSS, "RSAandMGF1");
        encryptionAlgs.put(CryptoProObjectIdentifiers.gostR3410_94.getId(), "GOST3410");
        encryptionAlgs.put(CryptoProObjectIdentifiers.gostR3410_2001.getId(), "ECGOST3410");
    }
    
    /**
     * Return the digest algorithm using one of the standard JCA string
     * representations rather the the algorithm identifier (if possible).
     */
    String getDigestAlgName(
        String digestAlgOID)
    {
        if (PKCSObjectIdentifiers.md5.getId().equals(digestAlgOID))
        {
            return "MD5";
        }
        else if (OIWObjectIdentifiers.idSHA1.getId().equals(digestAlgOID))
        {
            return "SHA1";
        }
        else if (NISTObjectIdentifiers.id_sha224.getId().equals(digestAlgOID))
        {
            return "SHA224";
        }
        else if (NISTObjectIdentifiers.id_sha256.getId().equals(digestAlgOID))
        {
            return "SHA256";
        }
        else if (NISTObjectIdentifiers.id_sha384.getId().equals(digestAlgOID))
        {
            return "SHA384";
        }
        else if (NISTObjectIdentifiers.id_sha512.getId().equals(digestAlgOID))
        {
            return "SHA512";
        }
        else if (PKCSObjectIdentifiers.sha1WithRSAEncryption.getId().equals(digestAlgOID))
        {
            return "SHA1";
        }
        else if (PKCSObjectIdentifiers.sha224WithRSAEncryption.getId().equals(digestAlgOID))
        {
            return "SHA224";
        }
        else if (PKCSObjectIdentifiers.sha256WithRSAEncryption.getId().equals(digestAlgOID))
        {
            return "SHA256";
        }
        else if (PKCSObjectIdentifiers.sha384WithRSAEncryption.getId().equals(digestAlgOID))
        {
            return "SHA384";
        }
        else if (PKCSObjectIdentifiers.sha512WithRSAEncryption.getId().equals(digestAlgOID))
        {
            return "SHA512";
        }
        else if (TeleTrusTObjectIdentifiers.ripemd128.getId().equals(digestAlgOID))
        {
            return "RIPEMD128";
        }
        else if (TeleTrusTObjectIdentifiers.ripemd160.getId().equals(digestAlgOID))
        {
            return "RIPEMD160";
        }
        else if (TeleTrusTObjectIdentifiers.ripemd256.getId().equals(digestAlgOID))
        {
            return "RIPEMD256";
        }
        else if (CryptoProObjectIdentifiers.gostR3411.getId().equals(digestAlgOID))
        {
            return "GOST3411";
        }
        else
        {
            return digestAlgOID;            
        }
    }
    
    /**
     * Return the digest encryption algorithm using one of the standard
     * JCA string representations rather the the algorithm identifier (if
     * possible).
     */
    String getEncryptionAlgName(
        String encryptionAlgOID)
    {
        String algName = (String)encryptionAlgs.get(encryptionAlgOID);

        if (algName != null)
        {
            return algName;
        }

        return encryptionAlgOID;
    }
    
    MessageDigest getDigestInstance(
        String algorithm, 
        String provider) 
        throws NoSuchProviderException, NoSuchAlgorithmException
    {
        if (provider != null)
        {
            try
            {
                return MessageDigest.getInstance(algorithm, provider);
            }
            catch (NoSuchAlgorithmException e)
            {
                return MessageDigest.getInstance(algorithm); // try rolling back
            }
        }
        else
        {
            return MessageDigest.getInstance(algorithm);
        }
    }
    
    Signature getSignatureInstance(
        String algorithm, 
        String provider) 
        throws NoSuchProviderException, NoSuchAlgorithmException
    {
        if (provider != null)
        {
            return Signature.getInstance(algorithm, provider);
        }
        else
        {
            return Signature.getInstance(algorithm);
        }
    }
}
