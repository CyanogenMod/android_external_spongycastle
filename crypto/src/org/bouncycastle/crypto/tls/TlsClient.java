package org.bouncycastle.crypto.tls;

import java.io.IOException;
import java.util.Hashtable;

interface TlsClient
{
    TlsCipherSuite createCipherSuite(int cipherSuite, TlsProtocolHandler handler)
        throws IOException;

    CertificateVerifyer getCertificateVerifyer();

    int[] getCipherSuites();

    byte[] generateCertificateSignature(byte[] md5andsha1, TlsProtocolHandler handler)
        throws IOException;

    Certificate getCertificate();

    // Hashtable is (Integer -> byte[])
    Hashtable generateClientExtensions();

    // Hashtable is (Integer -> byte[])
    void processServerExtensions(Hashtable serverExtensions);
}
