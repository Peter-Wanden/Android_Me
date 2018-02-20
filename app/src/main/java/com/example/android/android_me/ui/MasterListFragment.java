package com.example.android.android_me.ui;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

/**
 * Created by peter on 20/02/2018.
 * Retrieves a list of images and displays them in a GridView
 */

public class MasterListFragment extends Fragment {

    public MasterListFragment() {}

    // Inflates the grid view
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.fragment_master_list, container, false);

        // Get a reference to the GridView
        GridView gridView = (GridView) rootView.findViewById(R.id.images_grid_view);

        // Create the adapter. Pass in the Context and list of all image resources
        MasterListAdapter mAdapter = new MasterListAdapter(getContext(), AndroidImageAssets.getAll());

        // Set the adapter on the GridView
        gridView.setAdapter(mAdapter);

        // Return the RootView
        return rootView;
    }
}
