package com.example.android.chengdutourguide;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DescriptionAdapter extends ArrayAdapter<Description> {
    // The color of each main layout
    private int mBackgoundColor;

    public DescriptionAdapter(Activity context, ArrayList<Description> Words,int color) {
        // Here, we initialize the ArrayAdapter's internal storage for the context and the list.
        // the second argument is used when the ArrayAdapter is populating a single TextView.
        // Because this is a custom adapter for two TextViews, the adapter is not
        // going to use this second argument, so it can be any value. Here, we used 0.
        super(context, 0, Words);
        this.mBackgoundColor = color;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Description currentDescription = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID default_text_view
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_text_view);
        // Get the English word from the current Word object and
        // set this text on the defaultWord TextView
        nameTextView.setText(currentDescription.getName());

        // Find the miwok word in the list_item.xml layout
        TextView detailTextView = (TextView) listItemView.findViewById(R.id.detail_text_view);
        // Get the miwok word from the current Word object and
        // set this text on the miwokWord TextView TextView
        detailTextView.setText(currentDescription.getDetail());

        // set the color of the text
        View textLayout = listItemView.findViewById(R.id.text_layout);
        int color = ContextCompat.getColor(getContext(), mBackgoundColor);
        // Set the background color of the text container View
        textLayout.setBackgroundColor(color);

        // Find the ImageView in the list_item.xml layout with the ID
        ImageView iconView = (ImageView) listItemView.findViewById(R.id.icon_view);
        //Whether there is a valid image
        if (currentDescription.hasImage()) {
            // if so, get the image resource ID from the current Word object and
            // set the image to iconView
            iconView.setImageResource(currentDescription.getImageResourceId());
            iconView.setVisibility(View.VISIBLE);
        }
        //Otherwise, set the ImageView invisible
        else
        {
            iconView.setVisibility(View.GONE);
        }

        // Return the whole list item layout
        // so that it can be shown in the ListView
        return listItemView;
    }
}
