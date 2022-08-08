package de.tum.in.ase.eist;

import java.util.List;

public class Context {
    private SearchStrategy searchAlgorithm;
    private List<Chapter> book;

    public Context(SearchStrategy searchStrategy, List<Chapter> book) {
        this.searchAlgorithm = searchStrategy;
        this.book = book;
    }

    public Context() {
    }

    public SearchStrategy getSearchAlgorithm() {
        return searchAlgorithm;
    }

    public void setSearchAlgorithm(SearchStrategy searchAlgorithm) {
        this.searchAlgorithm = searchAlgorithm;
    }

    public List<Chapter> getBook() {
        return book;
    }

    public void setBook(List<Chapter> book) {
        this.book = book;
    }

    public int search(String name) {
        return searchAlgorithm.performSearch(book, name);
    }

    public static boolean rightOrder(String pre, String post) {
        char[] preC = pre.toCharArray();
        char[] postC = post.toCharArray();
        boolean right = true;
        int min = preC.length;
        if (postC.length < preC.length) {
            min = postC.length;
        }
        for (int i = 0; i < min; i++) {
            if (preC[i] < postC[i]) {
                break;
            } else if (preC[i] > postC[i]) {
                right = false;
                break;
            }
        }
        return right;
    }

    public boolean isChaptersSortedByName() {
        boolean isSortedByName = true;
        for (int i = 0; i < book.size() - 1; i++) {
            if (!rightOrder(book.get(i).getName(), book.get(i + 1).getName()))
                return false;
        }
        return true;
    }
}
