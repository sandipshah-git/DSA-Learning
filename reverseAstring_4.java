// // 4 : Reverse a String
// // Write a function that reverses a given string. 

// public class reverseAstring_4 {
//     public static void main(String[] args) {
//         String str = "SAndip shah";

//         String result = ReverseString(str);
//         System.out.println(result);

//     }

//     public static String ReverseString(String input){
//         String reversed = "";
//         for(int i = input.length()-1; i >= 0; i--){
//             reversed += input.charAt(i);
//         }
//         return reversed;
//     }
// }



//  Reverse string using StringBuilder -> it is a mutable sequence of characters.

public class reverseAstring_4 {

    // Function to reverse a string using StringBuilder
    public static String reverseString(String input) {
        StringBuilder sb = new StringBuilder(input); // Convert String to mutable StringBuilder for efficient modification
        return sb.reverse().toString(); // reverse() method and convert back to String
    }

    public static void main(String[] args) {
        String text = "Leapfrog Fellowship";

        System.out.println("Original String: " + text);

        // Function call
        String reversedText = reverseString(text);

        System.out.println("Reversed String: " + reversedText);
    }
}
