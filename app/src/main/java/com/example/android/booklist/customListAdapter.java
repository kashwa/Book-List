package com.example.android.booklist;


import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by aabedxx on 11/26/2017.
 */

public class customListAdapter extends ArrayAdapter<customList> {
    public customListAdapter(@NonNull Context context, @LayoutRes int resource) {
        super(context, resource);
    }

    public customListAdapter(FragmentActivity activity, ArrayList<customList> Blist) {
        super(activity,0,Blist);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_main, parent, false);
        }
        // Get the {@link CustomList} object located at this position in the list
        customList currentItem = getItem(position);

        // Find the TextView in the customlist.xml layout with the ID place_name
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.titleText);

        // Get the title name from the current customList object and
        // set this text on the name TextView
        nameTextView.setText(currentItem.getTitle());

        // Find the ImageView in the Customlist.xml layout with the ID list_item_icon
        TextView namedTextView = (TextView) listItemView.findViewById(R.id.authorText);

        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        namedTextView.setText(currentItem.getAuthor());

        return listItemView;
    }
}
