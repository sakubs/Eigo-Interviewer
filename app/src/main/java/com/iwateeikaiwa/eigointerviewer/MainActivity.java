package com.iwateeikaiwa.eigointerviewer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class MainActivity extends AppCompatActivity {

    private Button mNextButton;
    private Button mHintButton;
    private Button mFinishButton;
    private TextView mContentView;
    private ArrayList<String> mQuestions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuestions = new ArrayList<String>(
                Arrays.asList(getResources().getStringArray(R.array.questions)));

        mNextButton = (Button) findViewById(R.id.btn_next);
        mHintButton = (Button) findViewById(R.id.btn_hint);
        mFinishButton = (Button) findViewById(R.id.btn_finish);
        mContentView = (TextView) findViewById(R.id.tv_content);

        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a random question.

                mContentView.setText(getFact());
            }
        });

        mHintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mFinishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    public String getFact() {

        Random random = new Random();
        return mQuestions.get(random.nextInt(mQuestions.size()));
    }
}
