package com.learning.learningfragments;

import android.os.Bundle;
import android.app.Activity;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

	public class MyListFragment extends Fragment {
	  
		private static final String TAG = MyListFragment.class.getSimpleName();
		
	  private MyListFragment.OnItemSelectedListener listener;
	  
	  @Override
	  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		Log.v(TAG, "#onCreateView");
		
	    View view = inflater.inflate(R.layout.fragment_rsslist_overview, container, false);
	    Button button = (Button) view.findViewById(R.id.button1);
	    button.setOnClickListener(new View.OnClickListener() {
	      @Override
	      public void onClick(View v) {
	        updateDetail();
	      }
	    });
	    return view;
	  }

	public interface OnItemSelectedListener {
		public void onRssItemSelected(String link);
	}
	  
	@Override
    public void onAttach(Activity activity) {
      super.onAttach(activity);
      
      Log.v( TAG, "#onAttach" );
      
      if( activity instanceof OnItemSelectedListener ) {
    	  Log.v( TAG, " must implemenet MyListFragment.OnItemSelectedListener" );
    	  listener = (OnItemSelectedListener) activity;
      } else {
    	  throw new ClassCastException( activity.toString()  + " must implemenet MyListFragment.OnItemSelectedListener" );
      }
    }
	  
	  // May also be triggered from the Activity
	  public void updateDetail() {
	    // Create fake data
	    String newTime = String.valueOf(System.currentTimeMillis());
	    // Send data to Activity
	    listener.onRssItemSelected(newTime);
	  }
	}