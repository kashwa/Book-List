package com.example.android.booklist;

/**
 * Created by aabedxx on 11/26/2017.
 */

import android.content.Context;
import android.support.v4.content.AsyncTaskLoader;

public class BookLoader extends AsyncTaskLoader<String> {

    // variable to store the search string.
    private String mQueryString;


    public BookLoader(Context context, String queryString) {
        super(context);
        mQueryString = queryString;
    }

    @Override
    protected void onStartLoading() {
        // Starts the loadInBackground method
        forceLoad();
    }

    @Override
    public String loadInBackground() {
        return NetworkUtils.getBookInfo(mQueryString);
    }
}
