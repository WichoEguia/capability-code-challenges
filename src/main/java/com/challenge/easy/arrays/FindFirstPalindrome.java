package com.challenge.easy.arrays;

import java.util.Arrays;
import java.util.List;

/**
     Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

     A string is palindromic if it reads the same forward and backward.

     Example 1:
         Input: words = ["abc","car","ada","racecar","cool"]
         Output: "ada"
         Explanation: The first string that is palindromic is "ada".
         Note that "racecar" is also palindromic, but it is not the first.

     Example 2:
         Input: words = ["notapalindrome","racecar"]
         Output: "racecar"
         Explanation: The first and only string that is palindromic is "racecar".

     Example 3:
         Input: words = ["def","ghi"]
         Output: ""
         Explanation: There are no palindromic strings, so the empty string is returned.

     Constraints:

         * 1 <= words.length <= 100
         * 1 <= words[i].length <= 100
         * words[i] consists only of lowercase English letters.
 */
public class FindFirstPalindrome {

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            String reversedWord = new StringBuilder(word).reverse().toString();
            if (reversedWord.equals(word)) {
                return word;
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        String result = FindFirstPalindrome.firstPalindrome(words);
        System.out.println(result);
    }
}
