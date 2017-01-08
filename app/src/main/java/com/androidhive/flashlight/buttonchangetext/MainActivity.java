package com.androidhive.flashlight.buttonchangetext;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity {

    private String scn_text_to_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  buttonClick(View v){
        Log.i (TAG, "Starting new Activity");

        TextView screen_text = (TextView) findViewById(R.id.textView);
        scn_text_to_send = screen_text.getText().toString();

        Intent intent = new Intent(this, NewActivity.class);
        intent.putExtra("screenText", scn_text_to_send);
        startActivity(intent);
    }

}
