package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.util.HashMap;
import java.util.List;

public class BookmarkingTool {
    private List<Bookmark> savedBookmarks;

    public Bookmark addBookmark(String url){
        return null;
    }

    public boolean addKeywordToUrl(String keyword, String url){
        return true;
    }

    public boolean checkIfUrlValid(String url){
        return true;
    }

    public boolean checkIfDuplicate(Bookmark bookmark){
        return true;
    }


}
