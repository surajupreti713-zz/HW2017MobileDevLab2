package com.example.supreti.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private TextView mGeneralTextView;
    private Button mBlueButton;
    private Button mGreenButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGeneralTextView = (TextView) findViewById(R.id.general_text_view);
        mBlueButton = (Button) findViewById(R.id.blue_button);

        mBlueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mGeneralTextView.setText("now we feel blue");
            }
        });
        mGreenButton = (Button) findViewById(R.id.green_button);
        mGreenButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mGeneralTextView.setText("now we feel green");
            }
        });
    }
}
