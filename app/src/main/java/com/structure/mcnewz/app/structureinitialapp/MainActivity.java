package com.structure.mcnewz.app.structureinitialapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.sample.manit.HelloWorld;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Log.i(TAG, "onCreate: ");
        setContentView(R.layout.activity_main);

        HelloWorld hello = new HelloWorld();

        Toast.makeText(this, "" + hello.getName(), Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate: " + hello.getName());

    }
}
