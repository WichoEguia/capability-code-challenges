package com.challenge.easy.string;

import java.util.HashSet;
import java.util.Set;

/**

     # Jewels and Stones

     You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have.
     Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.

     Letters are case sensitive, so "a" is considered a different type of stone from "A".

     Example 1:
         Input: jewels = "aA", stones = "aAAbbbb"
         Output: 3

     Example 2:
         Input: jewels = "z", stones = "ZZ"
         Output: 0

     Constraints:

         * 1 <= jewels.length, stones.length <= 50
         * jewels and stones consist of only English letters.
         * All the characters of jewels are unique.
 */
public class JewelsAndStones {

    public static int numJewelsInStones(String jewels, String stones) {
        int count = 0;
        Set<String> jewelsSet = new HashSet<>();
        for (char jewel : jewels.toCharArray()) {
            jewelsSet.add(String.valueOf(jewel));
        }
        for (char stone : stones.toCharArray()) {
            if (jewelsSet.contains(String.valueOf(stone))) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String jewels = "zZbA";
        String stones = "aAAbbbb";
        int res = numJewelsInStones(jewels, stones);
        System.out.println(res);
    }
}
