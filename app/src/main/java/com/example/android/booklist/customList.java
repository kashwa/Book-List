package com.example.android.booklist;

/**
 * Created by aabedxx on 11/26/2017.
 */

public class customList {
    /*
        ** Implemented custom class to hold data fetched from the google books api into list view.
    */
    // string to hold the Title.
    private String title;

    // string to hold the Author.
    private String author;

    public customList(String bTitle, String bAuthor){
        title = bTitle;
        author = bAuthor;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
