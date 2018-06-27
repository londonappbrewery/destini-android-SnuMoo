package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //This project/challenge has been completed without the use of if/else statements and OR/AND statements
    //but the if/else logic is used extensively
    //various level no. is marked at each level of the game
    //mStoryIndex has been set up in case of further development of the game


    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mTopButton;
    Button mBottomButton;
    int mStoryIndex = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        mStoryTextView = (TextView) findViewById(R.id.storyTextView);

        mTopButton = findViewById(R.id.buttonTop);

        mBottomButton = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        mTopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //LEVEL 2 A
                mStoryTextView.setText(R.string.T3_Story);

                mTopButton.setText(R.string.T3_Ans1);
                mBottomButton.setText(R.string.T1_Ans2);

                mStoryIndex = mStoryIndex + 1;

                mTopButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //LEVEL 3 A
                        mStoryTextView.setText(R.string.T6_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);

                        mStoryIndex = mStoryIndex + 1;
                    }
                });

                mBottomButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //LEVEL 3 B
                        mStoryTextView.setText(R.string.T5_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        mStoryIndex = mStoryIndex + 1;
                    }
                });
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        mBottomButton.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //LEVEL 2 B
                mStoryTextView.setText(R.string.T2_Story);

                mTopButton.setText(R.string.T2_Ans1);
                mBottomButton.setText(R.string.T2_Ans2);

                mStoryIndex = mStoryIndex + 1;

                mTopButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //LEVEL 3 A
                        mStoryTextView.setText(R.string.T3_Story);
                        mTopButton.setText(R.string.T3_Ans1);
                        mBottomButton.setText(R.string.T3_Ans2);

                        mStoryIndex = mStoryIndex + 1;

                        mTopButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                //LEVEL 4 A
                                mStoryTextView.setText(R.string.T6_End);
                                mTopButton.setVisibility(View.GONE);
                                mBottomButton.setVisibility(View.GONE);
                                mStoryIndex = mStoryIndex + 1;
                            }
                        });

                        mBottomButton.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                                //LEVEL 4 B
                                mStoryTextView.setText(R.string.T5_End);
                                mTopButton.setVisibility(View.GONE);
                                mBottomButton.setVisibility(View.GONE);
                                mStoryIndex = mStoryIndex + 1;
                            }
                        });
                    }
                });

                mBottomButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        //LEVEL 3 B
                        mStoryTextView.setText(R.string.T4_End);
                        mTopButton.setVisibility(View.GONE);
                        mBottomButton.setVisibility(View.GONE);
                        mStoryIndex = mStoryIndex + 1;
                    }
                });


            }
        }));
    }
}
