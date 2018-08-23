package com.example.jillhubbard.quickapplauncher;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Laumching a second activity within our app
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        //create a listener
        secondActivityBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //create a new intent to start second activity within the current app
                Intent startIntent = new Intent(getApplicationContext(),SecondActivity.class);
                //pass info from main activity to second activity
                startIntent.putExtra("com.example.jillhubbard.quickapplauchner.TEXT", "Hiya!");
                startActivity(startIntent);

            }
        });

        //Launch an activity outside our app
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String google ="htttp://www.google.com";
                Uri webaddress=Uri.parse(google);
                //This intent will launch google
                Intent gotoGoogle=new Intent(Intent.ACTION_VIEW,webaddress);
                if (gotoGoogle.resolveActivity(getPackageManager())!= null) //test to make sure there is an app to launch google
                    startActivity(gotoGoogle); //if so, start the activity

            }
        });
    }
}
