//  3_Count Vowels
//  Write a function that counts the number of vowels (a, e, i, o, u) in a given string. Ignore case.

public class countVowels_3 {

    // Function to count vowels
    public static int countVowels(String str) {
        str = str.toLowerCase(); // convert to lowercase to handle case insensitivity
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Check if character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String input = "Leapfrog Fellowship";

        System.out.println("Input String: " + input);

        // Function call
        int result = countVowels(input);

        System.out.println("Total Vowels: " + result);
    }
}
