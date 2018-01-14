package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

/**
 * Created by Peter Wanden on 14/01/2018.
 */

// TODO (2) Create a new class called BodyPartFragment to display an image of an Android-Me body part
// In this class, you'll need to implement an empty constructor and the onCreateView method

public class BodyPartFragment extends Fragment {

    // Tag for logging
    private static final String TAG = "BodyPartFragment";

    // Variables to store a list of image resources and the index of the image that this fragment displays
    private List<Integer> mImageIds;
    private int mListIndex;

    // Mandatory constructor for instantiating the fragment
    public BodyPartFragment() {
    }

    /**
     * Inflates the fragment layout and sets any image resources
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // TODO (3) Show the first image in the list of head images
        // Soon, you'll update this image display code to show any image you want

        // Inflate the Android-Me fragment layout
        View rootView = inflater.inflate(R.layout.fragment_body_part, container, false);

        // Get a refrence to the ImageViewin the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById(R.id.body_part_image_view);

        // Check to see if image id's have been set
        if(mImageIds != null) {
            // Set the image resource to the list item at the stored index
            imageView.setImageResource(mImageIds.get(mListIndex));
        } else {
            // Log message letting us know there are no image id's in the list
            Log.v(TAG, "This fragment has a null list of image id's");
        }

        // Return rootView
        return rootView;
    }

    // Setter methods for keeping track of the list images this fragment can display and which image
    // in the list is currently being displayed

    public void setmImageIds(List<Integer> imageIds){ mImageIds = imageIds; }
    public void setmListIndex (int index) { mListIndex = index; }


}
