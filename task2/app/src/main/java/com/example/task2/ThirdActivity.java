package com.example.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView = (TextView) findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra("line"));
    }

    public void clickButton(View v)
    {
        Intent intent = new Intent();
        intent.putExtra("newline", "Goodbye world!");
        setResult(RESULT_OK, intent);
        finish();
    }
}
