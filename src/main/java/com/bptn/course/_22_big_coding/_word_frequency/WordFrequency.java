package com.bptn.course._22_big_coding._word_frequency;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
	public static void main(String[] args) {
        String sentence = "This is a test sentence with no repeating words";

        // Split the sentence into words using split() method
        
        String[]words = sentence.split(" "); //splitting the sentence into an array of words. 
        //the " " acts as the delimiter/identifier for spaces between words. 
        

        // Create a Map to store the frequency of each word
        Map<String, Integer> wordFrequency = new HashMap<>();

        // Iterate through each word in the sentence
        for (String s : words) // for (dataType item : collection) 
        {
            // If the word is already in the map, increment its frequency 
            if (wordFrequency.containsKey(s)) {
                wordFrequency.put(s, wordFrequency.get(s) + 1);
            }
            // If the word is not in the map, add it with a frequency of 1
            else {
               wordFrequency.put(s, 1);
            }
        }

        // Print the frequency of each word
        System.out.println("Word frequency: " + wordFrequency);
    }
}
