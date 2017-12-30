package com.example.android.chengdutourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class QingchengshanFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.description_list, container, false);
        super.onCreate(savedInstanceState);

        // Create a list of words
        final ArrayList<Description> descriptions = new ArrayList<Description>();
        descriptions.add(new Description(getResources().getString(R.string.historical_sites),
                getResources().getString(R.string.historical_sites_qingchengshan), R.drawable.qingchengshan_history));
        descriptions.add(new Description(getResources().getString(R.string.natural_attractions),
                getResources().getString(R.string.natural_attractions_qingchengshan), R.drawable.qingchengshan_nature));
        descriptions.add(new Description(getResources().getString(R.string.food),
                getResources().getString(R.string.food_qingchengshan), R.drawable.qingchengshan_food));
        descriptions.add(new Description(getResources().getString(R.string.leisure),
                getResources().getString(R.string.leisure_qingchengshan), R.drawable.qingchengshan_leisure));
        // Create an {@link DescriptionAdapter}, whose data source is a list of {@link Description}s. The
        // adapter knows how to create list items for each item in the list.
        DescriptionAdapter adapter = new DescriptionAdapter(getActivity(), descriptions, R.color.category_qingchengshan);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // description_listyout file.

        final ListView listView = (ListView) rootView.findViewById(R.id.list);
        // Make the {@link ListView} use the {@link DescriptionAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);
        return rootView;
    }
}
