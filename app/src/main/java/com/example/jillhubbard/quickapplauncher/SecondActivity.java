package com.example.jillhubbard.quickapplauncher;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //test if intent has extra info
        if (getIntent().hasExtra("com.example.jillhubbard.quickapplauchner.TEXT"))
        {
            TextView tv = (TextView)findViewById(R.id.textView);  //find the textview id
            //get thte intent data
            String text = getIntent().getExtras().getString("com.example.jillhubbard.quickapplauchner.TEXT");
            tv.setText(text);  //set the text to the intents data
        }
    }
}
