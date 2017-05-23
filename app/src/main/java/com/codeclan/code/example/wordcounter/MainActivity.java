package com.codeclan.code.example.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText inputTextBox;
    private Button countWordsButton;
    private EditText displayWordsCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextBox = (EditText) findViewById(R.id.input_text_box);
        countWordsButton = (Button) findViewById(R.id.button_count_words);
        displayWordsCount = (EditText) findViewById(R.id.display_words_count);
    }



}
