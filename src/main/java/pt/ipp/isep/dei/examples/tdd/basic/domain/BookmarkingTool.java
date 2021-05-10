package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class BookmarkingTool {
    private List<Bookmark> savedBookmarks = Collections.emptyList();

    public Bookmark addBookmark(String url){
        return null;
    }

    public boolean addKeywordToUrl(String keyword, String url){
        return true;
    }

    public boolean checkIfUrlValid(String url){
        return true;
    }

    public boolean checkIfNotDuplicate(String url){
        return true;
    }


    public List<Bookmark> getSavedBookmarks() {
        return savedBookmarks;
    }

    public void setSavedBookmarks(List<Bookmark> savedBookmarks) {
        this.savedBookmarks = savedBookmarks;
    }

}
