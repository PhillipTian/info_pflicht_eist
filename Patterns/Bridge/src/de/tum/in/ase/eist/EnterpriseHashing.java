package de.tum.in.ase.eist;

public class EnterpriseHashing extends Hashing {
    public EnterpriseHashing(CryptoSecureHashAlgorithm cryptoSecureHashAlgorithm) {
        super(cryptoSecureHashAlgorithm);
    }

    public String hashDocument(String str) {
        return super.getImplementation().calculateHashCode(str);
    }

}
