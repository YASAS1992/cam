package com.example.cam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.common.ActCommon;
import com.example.common.Parent;

public class MainActivity extends ActCommon {

    private TextView tvHello;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parent parent = new Parent();

        parent.setAbc("Cambodia");

        tvHello = findViewById(R.id.tvHello);

        tvHello.setText(parent.getAbc());

    }
}
