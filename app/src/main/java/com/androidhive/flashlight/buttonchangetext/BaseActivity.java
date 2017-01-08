package com.androidhive.flashlight.buttonchangetext;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by Steven on 01/01/2017.
 */

public class BaseActivity extends AppCompatActivity {

    public final String TAG = "Base Activity";

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main_activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.twitter:
                Log.i(TAG, "Twitter item clicked");
                return true;

            case R.id.facebook:
                Log.i(TAG, "Facebook item clicked");
                return true;

            case R.id.refresh:
                Log.i(TAG, "Refresh item clicked");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
