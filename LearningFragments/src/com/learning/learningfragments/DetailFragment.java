package com.learning.learningfragments;

import com.learning.learningfragments.R;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

	
public class DetailFragment extends Fragment {
	private static final String TAG = DetailFragment.class.getSimpleName();
	
	 @Override
	 public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
		Log.v(TAG, "#onCreateView");
		View view = inflater.inflate(R.layout.fragment_rssitem_detail, container, false);
		 
	    return view;
	 }

	 public void setText(String item) {
	   TextView view = (TextView) getView().findViewById(R.id.detailsText);
	   view.setText(item);
	 }
}