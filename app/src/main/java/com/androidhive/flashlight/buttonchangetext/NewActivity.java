package com.androidhive.flashlight.buttonchangetext;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Steven on 27/12/2016.
 */

public class NewActivity extends BaseActivity {

    TextView nameOut;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_activity);

        Intent intent = getIntent();
        String text =  intent.getStringExtra("screenText");

        Log.i("New Activity", "Intent text = "+ text);

        nameOut = (TextView) findViewById(R.id.nameln);
        nameOut.setText(text);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.new_activity_menu, menu);
        return true;
    }

    public void addComment(View v){
        String name, comment, other;

        EditText nameIn = (EditText) findViewById(R.id.name);
        EditText commentIn = (EditText) findViewById(R.id.comment);
        EditText otherIn = (EditText) findViewById(R.id.other);

        name = nameIn.getText().toString();
        comment = commentIn.getText().toString();
        other = otherIn.getText().toString();

        TextView commentOut = (TextView) findViewById(R.id.commentln);
        TextView otherOut = (TextView) findViewById(R.id.otherln);

        nameOut.setText(name);
        commentOut.setText(comment);
        otherOut.setText(other);
    }


}
