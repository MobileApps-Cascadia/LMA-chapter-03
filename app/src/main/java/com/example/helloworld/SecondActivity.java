package com.example.helloworld;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Set text in displayName to 'Hello user!'
        String userName = getIntent().getStringExtra("UserName");
        TextView textDisplay = (TextView) findViewById(R.id.displayName);
        textDisplay.setText("Hello " + userName.trim() + "!");
    }
}
