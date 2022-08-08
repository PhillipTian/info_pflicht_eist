package de.tum.in.ase.eist;

import java.util.List;

public class LinearSearch implements SearchStrategy {
    public int performSearch(List<Chapter> books, String name) {
        for (Chapter chapter : books) {
            if (chapter.getName() == name) return chapter.getPageNumber();
        }
        return -1;
    }
}
