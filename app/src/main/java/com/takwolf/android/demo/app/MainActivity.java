package com.takwolf.android.demo.app;

import android.os.Bundle;
import android.widget.TextView;

import com.takwolf.android.demo.library.DemoSdk;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView text = findViewById(R.id.text);
        text.setText(DemoSdk.TEXT);
    }

}
