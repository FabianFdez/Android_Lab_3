package com.abc.android_lab_3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class ActivityTest extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
    }

    public void clickDisplayCorrectToast(View view) {
        Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_SHORT).show();
    }
    public void clickDisplayIncorrectToast(View view) {
        Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_SHORT).show();
    }

}
