package com.codeclan.code.example.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText inputTextBox;
    private Button countWordsButton;
    private TextView displayWordsCount;
    private TextView details;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextBox = (EditText) findViewById(R.id.input_text_box);
        countWordsButton = (Button) findViewById(R.id.button_count_words);
        displayWordsCount = (TextView) findViewById(R.id.display_words_count);
        details =(TextView) findViewById(R.id.details);
    }

    public void onClickCountWordsButton(View button){
        String input = inputTextBox.getText().toString();
        Log.d(getClass().toString(), "the text was " + input);
        WordCounter wordCounter = new WordCounter(input);
        String result = String.valueOf(wordCounter.countWords());
        String summary = String.valueOf(wordCounter.getWordCountResultsForEachWord());
        Log.d(getClass().toString(), "the count was " + wordCounter.countWords());
        displayWordsCount.setText(result);
        details.setText(summary);
    }

}
