package de.tum.in.ase.eist;

public abstract class Hashing {

    private HashFunction implementation;

    public HashFunction getImplementation() {
        return implementation;
    }

    public Hashing(HashFunction hashFunction) {
       implementation=hashFunction;
    }

    public abstract String hashDocument(String str);


}
