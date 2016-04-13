package com.example.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intentObject = getIntent();
        String userName = intentObject.getStringExtra("UserName");




        TextView textDisplay = (TextView) findViewById(R.id.textViewDisplay);
        String welcomeString = "Hello " + userName;
        textDisplay.setText(welcomeString);

    }
}
