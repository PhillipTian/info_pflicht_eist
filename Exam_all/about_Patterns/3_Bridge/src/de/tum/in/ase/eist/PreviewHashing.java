package de.tum.in.ase.eist;

public class PreviewHashing extends Hashing {

    public PreviewHashing(SimpleHashAlgorithm simpleHashAlgorithm){
        super(simpleHashAlgorithm);
    }

    public String hashDocument(String str) {
        if(str.length()>1000){throw new IllegalArgumentException();}
        return super.getImplementation().calculateHashCode(str);
    }

}
