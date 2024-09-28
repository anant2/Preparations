package jp_morgan;

import java.math.BigDecimal;
import java.math.BigInteger;

public class SmallestStringReverse {

    public static String smallestByReversingAnyChars(String word) {
        String smallest = word;

        for(int i  = 0; i < word.length();i++) {
            for(int j = i + 1; j <= word.length();j++) {
                String reversed = reverseSubstring(word, i , j);

                if(reversed.compareTo(smallest) < 0) {
                    smallest = reversed;
                }
            }
        }

        return smallest;
    }

    public static String reverseSubstring(String word, int start, int end) {
        StringBuilder sb = new StringBuilder(word);
        String toReverse = sb.substring(start, end);
        sb.replace(start, end, new StringBuilder(toReverse).reverse().toString());
        return sb.toString();
    }

    public static void main(String[] args) {
        // Test case 1: Single character
        String word1 = "a";
        System.out.println(SmallestStringReverse.smallestByReversingAnyChars(word1)); // Expected: "a"

        // Test case 2: Already smallest string
        String word2 = "abc";
        System.out.println(SmallestStringReverse.smallestByReversingAnyChars(word2)); // Expected: "abc"

        // Test case 3: Reverse entire string
        String word3 = "cba";
        System.out.println(SmallestStringReverse.smallestByReversingAnyChars(word3)); // Expected: "abc"

        // Test case 4: Reverse substring to get smallest
        String word4 = "dbaca";
        System.out.println(SmallestStringReverse.smallestByReversingAnyChars(word4)); // Expected: "abdca"

        // Test case 5: All characters same
        String word5 = "aaaa";
        System.out.println(SmallestStringReverse.smallestByReversingAnyChars(word5)); // Expected: "aaaa"

        // Test case 6: Palindrome string
        String word6 = "racecar";
        System.out.println(SmallestStringReverse.smallestByReversingAnyChars(word6)); // Expected: "aacecrr"

        // Test case 7: Empty string
        String word7 = "";
        System.out.println(SmallestStringReverse.smallestByReversingAnyChars(word7)); // Expected: ""

        // Test case 8: String with special characters
        String word8 = "a!b@c#";
        System.out.println(SmallestStringReverse.smallestByReversingAnyChars(word8)); // Expected: "!a@b#c"

        
    }
}
