package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clicky(View view) {
        view.getId();
        Button button = (Button) findViewById(R.id.buttony);
        TextView textView = (TextView) findViewById(R.id.texty);
        EditText editText = (EditText) findViewById(R.id.textz);

        String input = editText.getText().toString();
        if (input.equals("SPECIAL")) {
            textView.setText("Super Secret Easter Egg");
        } else {
            textView.setText(input);
        }
    }
}