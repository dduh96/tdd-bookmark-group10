package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class BookmarkingToolTest {

    /**
     * checkIfDuplicate Case 1: Is Duplicate
     */
    @Test
    public void checkIfNotDuplicate_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        List<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = false;
        boolean actual = tool.checkIfNotDuplicate(url);

        assertEquals(expected, actual);
    }

    /**
     * checkIfDuplicate Case 2: Is Not Duplicate
     */
    @Test
    public void checkIfNotDuplicate_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";

        boolean expected = true;
        boolean actual = tool.checkIfNotDuplicate(url);

        assertEquals(expected, actual);
    }

    /**
     * checkIfDuplicate Case 3: URL is NULL
     */
    @Test
    public void checkIfNotDuplicate_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;

        boolean expected = false;
        boolean actual = tool.checkIfNotDuplicate(url);

        assertEquals(expected, actual);
    }


    /**
     * checkIfUrlValid(String url)
     * only checks syntax of URL string, not if website exists
     * Case 1: URL is not valid
     */
    @Test
    public void checkIfUrlValid_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "hello, world!";

        boolean expected = false;
        boolean actual = tool.checkIfUrlValid(url);

        assertEquals(expected, actual);
    }

    /**
     * checkIfUrlValid(String url)
     * only checks syntax of URL string, not if website exists
     * Case 2: URL is valid
     */
    @Test
    public void checkIfUrlValid_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";

        boolean expected = true;
        boolean actual = tool.checkIfUrlValid(url);

        assertEquals(expected, actual);
    }

    /**
     * checkIfUrlValid(String url)
     * only checks syntax of URL string, not if website exists
     * Case 3: URL is NULL
     */
    @Test
    public void checkIfUrlValid_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;

        boolean expected = false;
        boolean actual = tool.checkIfUrlValid(url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 1: Operation successful
     */
    @Test
    public void addKeywordToUrl_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = "programming";
        List<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = true;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 2: URL does not exist in BookmarkList
     */
    @Test
    public void addKeywordToUrl_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = "programming";


        boolean expected = false;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 3: Keyword is NULL
     */
    @Test
    public void addKeywordToUrl_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = null;
        List<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = false;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 4: URL is NULL
     */
    @Test
    public void addKeywordToUrl_caseFour(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;
        String keyword = "programming";
        List<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = false;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 5: Keyword and URL is NULL
     */
    @Test
    public void addKeywordToUrl_caseFive(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;
        String keyword = null;
        List<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = false;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 6: Bookmark already has associated Keyword
     */
    @Test
    public void addKeywordToUrl_caseSix(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = "programming";
        Bookmark bookmark = new Bookmark(url);
        bookmark.setKeyword("work");
        List<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(bookmark);
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = true;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addKeywordToUrl(String keyword, String url)
     * Adds a Keyword to a URL, if the bookmark already has an associated URL
     * it is simply overwritten
     * Case 7: Testing Case Sensitivity
     */
    @Test
    public void addKeywordToUrl_caseSeven(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        String keyword = "programming";
        Bookmark bookmark = new Bookmark(url);
        bookmark.setKeyword("Programming");
        List<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(bookmark);
        tool.setSavedBookmarks(savedBookmarks);

        boolean expected = true;
        boolean actual = tool.addKeywordToUrl(keyword, url);

        assertEquals(expected, actual);
    }

    /**
     * addBookmark(String url)
     * tries to add a new Bookmark, if successful it returns the created object
     * Case 1: URL does not already exist, is successful
     */
    @Test
    public void addBookmark_caseOne(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";

        Bookmark expected = new Bookmark(url);
        Bookmark actual = tool.addBookmark(url);

        assertEquals(expected, actual);
    }

    /**
     * addBookmark(String url)
     * tries to add a new Bookmark, if successful it returns the created object
     * Case 2: URL already exists
     */
    @Test
    public void addBookmark_caseTwo(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "https://github.com";
        List<Bookmark> savedBookmarks = tool.getSavedBookmarks();
        savedBookmarks.add(new Bookmark(url));
        tool.setSavedBookmarks(savedBookmarks);

        Bookmark expected = new Bookmark(url);
        expected.setRating(2);
        Bookmark actual = tool.addBookmark(url);

        assertEquals(expected, actual);
    }

    /**
     * addBookmark(String url)
     * tries to add a new Bookmark, if successful it returns the created object
     * Case 3: URL is NULL
     */
    @Test
    public void addBookmark_caseThree(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = null;

        Bookmark expected = null;
        Bookmark actual = tool.addBookmark(url);

        assertEquals(expected, actual);
    }

    /**
     * addBookmark(String url)
     * tries to add a new Bookmark, if successful it returns the created object
     * Case 4: URL is invalid
     */
    @Test
    public void addBookmark_caseFour(){
        BookmarkingTool tool = new BookmarkingTool();
        String url = "hello, world!";

        Bookmark expected = null;
        Bookmark actual = tool.addBookmark(url);

        assertEquals(expected, actual);
    }


}
