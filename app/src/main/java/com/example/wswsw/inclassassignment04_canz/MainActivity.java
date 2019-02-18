package com.example.wswsw.inclassassignment04_canz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button mCopyButton;
    private Button mDoubleButton;
    private Button mUpButton;
    private Button mDownButton;
    private EditText userInputView;
    private TextView displayView;
    private int textSize=12;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, R.string.welcome_word, Toast.LENGTH_SHORT).show();

        userInputView=(EditText)findViewById(R.id.user_input_view);
        displayView=(TextView) findViewById(R.id.display_view);

        mCopyButton=(Button)findViewById(R.id.copy_button);
        //show the user input in displayView below
        mCopyButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textSize=12;
                displayView.setTextSize(textSize);
                String input = userInputView.getText().toString();
                displayView.setText(input);
            }
        });

        mDoubleButton=(Button)findViewById(R.id.double_button);
        //double the user input in displayView below
        mDoubleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String display = displayView.getText().toString();
                displayView.setText(display+display);
            }
        });

        mUpButton=(Button)findViewById(R.id.up_button);
        //increase the textSize of words in displayView below
        mUpButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textSize+=1;
                displayView.setTextSize(textSize);
            }
        });

        mDownButton=(Button)findViewById(R.id.down_button);
        //decrease the textSize of words in displayView below
        mDownButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                textSize-=1;
                displayView.setTextSize(textSize);
            }
        });
    }
}
