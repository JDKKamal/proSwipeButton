package com.jdkgroup.proswipebutton;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jdkgroup.customview.ProSwipeButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ProSwipeButton proSwipeBtn = findViewById(R.id.proswipebutton_main);
        final ProSwipeButton proSwipeBtnError = findViewById(R.id.proswipebutton_main_error);

        proSwipeBtn.setOnSwipeListener(new ProSwipeButton.OnSwipeListener() {
            @Override
            public void onSwipeConfirm() {
                // user has swiped the btn. Perform your async operation now
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        proSwipeBtn.showResultIcon(true);
                    }
                }, 2000);
            }
        });

        proSwipeBtnError.setOnSwipeListener(new ProSwipeButton.OnSwipeListener() {
            @Override
            public void onSwipeConfirm() {
                // user has swiped the btn. Perform your async operation now
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        proSwipeBtnError.showResultIcon(false);
                    }
                }, 2000);
            }
        });
    }
}
