package com.example.task2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    TextView textView;
    Button nextButton;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.textView);
        nextButton = (Button) findViewById(R.id.nextButton);
    }

    public void clickButton(View v)
    {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("line", textView.getText().toString());
        startActivityForResult(intent, 1);
    }

    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (data == null)
        {
            return;
        }

        textView.setText(data.getStringExtra("newline"));
    }



}
