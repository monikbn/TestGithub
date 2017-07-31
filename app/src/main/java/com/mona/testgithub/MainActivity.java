package com.mona.testgithub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //salam monaaaaaa
        //the second salam to mona
        textView = (TextView) findViewById(R.id.textView1);
        textView.setText("salam kachall");
    }
}
