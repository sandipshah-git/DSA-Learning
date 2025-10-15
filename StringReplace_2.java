public class StringReplace_2 {
    public static void main(String[] args) {
        String input = "I want to join Leapfrog Technology. LEAPFROG is popular.";

        System.out.println("Before Replace: " + input);

        // Function call
        String result = replaceAllWords(input);

        System.out.println("After Replace: " + result);
    }

     // Function to replace all occurrences (case-insensitive)
    public static String replaceAllWords(String sentence) {
        // (?i) makes it case-insensitive
        return sentence.replaceAll("(?i)Leapfrog", "Fellowship");
    }
}
