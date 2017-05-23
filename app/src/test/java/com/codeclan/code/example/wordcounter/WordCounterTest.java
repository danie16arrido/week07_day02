package com.codeclan.code.example.wordcounter;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by user on 23/05/2017.
 */
public class WordCounterTest {

    @Test
    public void canStoreTextBlock(){
        WordCounter wordCounter =  new WordCounter("abc def");
        assertEquals("abc def", wordCounter.getTextBlock());
    }

    @Test
    public void canSplitTextBlock(){
        WordCounter wordCounter = new WordCounter("abc def");
        String[] split = {"abc", "def"};
        int counter = wordCounter.splitTestBlock().length;
        assertEquals(2, counter);
    }
    public void canDealWithTwoWhiteSpaces(){
        WordCounter wordCounter = new WordCounter("abc  def dd");
        int counter = wordCounter.splitTestBlock().length;
        assertEquals(2, counter);
    }

    @Test
    public void canCountWords(){
        WordCounter wordCounter = new WordCounter("one two three");
        assertEquals(3, wordCounter.countWords());
    }

    @Test
    public void canCountEachWordOccurrences(){
        WordCounter wordCounter = new WordCounter("one two one");
        HashMap<String, Integer> result = new HashMap<>();
        result = wordCounter.getWordCountResultsForEachWord();
        int oneCount = result.get("one");
        assertEquals(2, oneCount);
    }

    @Test
    public void canCountEachWordOccurrencesVone(){
        WordCounter wordCounter = new WordCounter("one two one three one  one");
        HashMap<String, Integer> result = new HashMap<>();
        result = wordCounter.getWordCountResultsForEachWord();
        int oneCount = result.get("one");
        assertEquals(4, oneCount);
    }

    @Test
    public void canCountEachWordOccurrencesNoWord(){
        WordCounter wordCounter = new WordCounter("two three");
        HashMap<String, Integer> result = new HashMap<>();
        result = wordCounter.getWordCountResultsForEachWord();
        int oneCount = result.get("one");
        assertEquals(0, oneCount);
    }




}