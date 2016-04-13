package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        //remember to import the android widget v
        TextView textDisplay = (TextView) findViewById(R.id.displayName);
        String userName = getIntent().getStringExtra("UserName");
        textDisplay.setText("Greetings " + userName);
    }
}
