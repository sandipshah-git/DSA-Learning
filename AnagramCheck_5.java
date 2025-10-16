/*Check if Two Strings are Anagrams

👉 Write a function that checks whether two strings are anagrams of each other.
✔ Ignore case
✔ Ignore spaces

Example:

Input: "Listen", "Silent"
Output: true */

import java.util.Arrays;

public class AnagramCheck_5 {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Sile \nnt";

        System.out.println(isAnagram(str1, str2)); // Calling function and printing result
    }

    // Function to check if two strings are anagrams
    public static boolean isAnagram(String str1, String str2) {
        // Step 1: Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Step 2: If lengths don't match, instantly return false (it's for Performance Optimization : if length doesn't match then no need to sort them and it's save time )
        if (str1.length() != str2.length()) {
            return false;
        }

        // Step 3: Convert strings to char arrays
        char[] arr1 = str1.toCharArray(); //  each character of the string becomes an element of the array.
        char[] arr2 = str2.toCharArray();

        // Step 4: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Step 5: Compare sorted arrays
        return Arrays.equals(arr1, arr2);
    }
}
