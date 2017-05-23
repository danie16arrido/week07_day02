package com.codeclan.code.example.wordcounter;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


/**
 * Created by user on 23/05/2017.
 */

public class WordCounter {
    private String input;
    private HashMap<String, Integer> wordCountEach;

    public WordCounter(String input){
        this.input = input;
        this.wordCountEach = new HashMap<>();
    }


    public String getTextBlock() {
        return this.input;
    }

    public String[] splitTestBlock() {
        return this.input.split(" ");
    }

    public int countWords() {
        return splitTestBlock().length;
    }

    public HashMap<String, Integer> getWordCountResultsForEachWord() {
        for (String word : splitTestBlock()){
            if (this.wordCountEach.get(word) != null){
                this.wordCountEach.put(word, this.wordCountEach.get(word) +1);
            }else {
                this.wordCountEach.put(word, 1);
            }
        }

        return this.wordCountEach;
    }

}
