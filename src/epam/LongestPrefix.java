package epam;

//Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".
// Example 1: Input: strs = ["flower","flow","flight"] Output: "fl"
// Example 2: Input: strs = ["dog","racecar","car"] Output: ""

public class LongestPrefix {

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String result = findLongestPrefix(arr);
        System.out.println(result);
    }

    private static String findLongestPrefix(String[] arr) {
        if (arr.length == 0) return "";
        String prefix = arr[0];

        for (int i = 1; i < arr.length; i++) {

            while (arr[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
            }

        }

        return prefix;

    }

}
