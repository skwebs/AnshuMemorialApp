package com.anshumemorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // set Windows Flags to Full Screen using setFlags function
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // Take instance of Action Bar using getSupportActionBar and if it is not Null then call hide function
        // if (getSupportActionBar() != null) { getSupportActionBar().hide(); }

        // try block to hide Action bar
        try {
            Objects.requireNonNull(this.getSupportActionBar()).hide();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}