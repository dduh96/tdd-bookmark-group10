package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
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
        try{
            new URL(url).toURI();
        }catch (Exception e){
            return false;
        }
        return true;

    }

    public boolean checkIfNotDuplicate(String url){
        if(url==null) return false;
        boolean isNotDuplicate = true;
        while(isNotDuplicate && savedBookmarks.iterator().hasNext()){
            if (savedBookmarks.iterator().next().getUrl().equals(url)) isNotDuplicate = false;
        }
        return isNotDuplicate;
    }


    public List<Bookmark> getSavedBookmarks() {
        return savedBookmarks;
    }

    public void setSavedBookmarks(List<Bookmark> savedBookmarks) {
        this.savedBookmarks = savedBookmarks;
    }

}
