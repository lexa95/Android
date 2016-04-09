package com.example.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    String line;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        line = getIntent().getStringExtra("line");
    }

    public void clickButton(View v)
    {
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra("line", line);
        startActivityForResult(intent, 1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        if (data == null)
        {
            return;
        }

        Intent intent = new Intent();
        intent.putExtra("newline", data.getStringExtra("newline"));
        setResult(RESULT_OK, intent);
        finish();
    }
}
