package com.learning.learningfragments;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.learning.learningfragments.DetailFragment;;

public class RssfeedActivity extends Activity implements MyListFragment.OnItemSelectedListener {

	private static final String TAG = RssfeedActivity.class.getSimpleName();
	
	@Override
	protected void onCreate( Bundle savedInstanceState ) {
		super.onCreate(savedInstanceState);
		Log.v(TAG, "#onCreateView");
		
		setContentView(R.layout.activity_rssfeed);
		
	}

	  //	if the wizard generated an onCreateOptionsMenu you can delete
	  // 	it, not needed for this tutorial
	  @Override
	  public void onRssItemSelected(String link) {
	    DetailFragment fragment = (DetailFragment) getFragmentManager().findFragmentById(R.id.detailFragment);
	        if( fragment != null && fragment.isInLayout() ) {
	        	fragment.setText(link);
	        }
	  }
}