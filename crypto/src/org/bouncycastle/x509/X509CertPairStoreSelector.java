package org.bouncycastle.x509;

import org.bouncycastle.util.Selector;

/**
 * This class is an <code>Selector</code> like implementation to select
 * certificates pairs, which are e.g. used for cross certificates. The set of
 * criteria is given from two
 * {@link org.bouncycastle.x509.X509CertStoreSelector}s whcih must be both
 * matched.
 *
 * @see org.bouncycastle.x509.X509AttributeCertificate
 * @see org.bouncycastle.x509.X509Store
 */
public class X509CertPairStoreSelector implements Selector
{

    private X509CertStoreSelector forwardSelector;

    private X509CertStoreSelector reverseSelector;

    private X509CertificatePair certPairChecking;

    /**
     * Returns the certificate pair which is checked *
     * <p/>
     * This is only a hint for the {@link X509Store} not a criteria whcih must
     * be matched.
     *
     * @return Returns the certificate pair which is checked.
     */
    public X509CertificatePair getCertPairChecking()
    {
        return certPairChecking;
    }

    /**
     * Set the certificate pair which is checked.
     * <p/>
     * This is only a hint for the {@link X509Store} not a criteria whcih must
     * be matched.
     *
     * @param certPairChecking The certPairChecking to set.
     */
    public void setCertPairChecking(X509CertificatePair certPairChecking)
    {
        this.certPairChecking = certPairChecking;
    }

    /**
     * Constructor for selecting a certificate pair. If you are only interested
     * in one part of the certificate pair, give an empty selector with no
     * criteria set for this part.
     *
     * @param forwardSelector The certificate selector for the forward part in the pair.
     * @param reverseSelector The certificate selector for the reverse part in the pair.
     */
    public X509CertPairStoreSelector(X509CertStoreSelector forwardSelector,
                                     X509CertStoreSelector reverseSelector)
    {
        this.forwardSelector = forwardSelector;
        this.reverseSelector = reverseSelector;
    }

    /**
     * Returns a clone of this selector.
     *
     * @return A clone of this selector.
     * @see java.lang.Object#clone()
     */
    public Object clone()
    {
        X509CertStoreSelector forward = (X509CertStoreSelector)forwardSelector
            .clone();
        X509CertStoreSelector reverse = (X509CertStoreSelector)reverseSelector
            .clone();
        return new X509CertPairStoreSelector(forward, reverse);
    }

    /**
     * Decides if the given certificate pair should be selected. If
     * <code>obj</code> is not a {@link X509CertificatePair} this method
     * returns <code>false</code>.
     *
     * @param obj The {@link X509CertificatePair} which should be tested.
     * @return <code>true</code> if the object matches this selector.
     */
    public boolean match(Object obj)
    {
        if (!(obj instanceof X509CertificatePair))
        {
            return false;
        }
        X509CertificatePair pair = (X509CertificatePair)obj;
        return forwardSelector.match((Object)pair.getForward())
            && reverseSelector.match((Object)pair.getReverse());
    }

    /**
     * Returns the certicate selector for the forward part.
     *
     * @return Returns the certicate selector for the forward part.
     */
    public X509CertStoreSelector getForwardSelector()
    {
        return forwardSelector;
    }

    /**
     * Returns the certicate selector for the reverse part.
     *
     * @return Returns the reverse selector for teh reverse part.
     */
    public X509CertStoreSelector getReverseSelector()
    {
        return reverseSelector;
    }

}
