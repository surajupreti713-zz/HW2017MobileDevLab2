package com.example.supreti.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    private TextView mGeneralTextView; //Declaring variable for TextView

    private Button mBlueButton;     //Declaring buttons
    private Button mGreenButton;

    private LinearLayout mLinearlayout;     //Reference for the top-most LienarLayout

    private boolean mBlueBackground = false;        //declaring two variables that keep track of whether to display the Toast again
    private boolean mGreenBackground = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLinearlayout = (LinearLayout)findViewById(R.id.placeholder);
        mGeneralTextView = (TextView) findViewById(R.id.general_text_view);
        mBlueButton = (Button) findViewById(R.id.blue_button);

        mBlueButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mGeneralTextView.setText(colorClick("blue"));
                if (mBlueBackground == false || mGreenBackground == true) {
                    mLinearlayout.setBackgroundResource(R.color.holo_blue_bright);
                    Toast.makeText(MainActivity.this, colorClick("blue"), Toast.LENGTH_SHORT).show();
                    mBlueBackground = true;
                    mGreenBackground = false;
                }
                else {
                    mLinearlayout.setBackgroundResource(R.color.holo_blue_bright);
                    mGreenBackground = false;
                }
            }
        });
        mGreenButton = (Button) findViewById(R.id.green_button);
        mGreenButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                mGeneralTextView.setText(colorClick("green"));
                if(mGreenBackground == false || mBlueBackground == true) {
                    mLinearlayout.setBackgroundResource(R.color.holo_green_light);
                    Toast.makeText(MainActivity.this, colorClick("green"), Toast.LENGTH_SHORT).show();
                    mGreenBackground = true;
                    mBlueBackground = false;
                }
                else {
                    mLinearlayout.setBackgroundResource(R.color.holo_green_light);
                    mBlueBackground = false;
                }

            }
        });
    }

    private String colorClick(String color){
        return "now we feel " + color;
    }


}
