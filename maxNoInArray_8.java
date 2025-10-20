//  Find Maximum Number in Array
//  Given an array, return the largest number.
//  Example: [5, 12, 3, 9, 21] → 21


public class maxNoInArray_8 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 3, 9, 21}; // Example array

        System.out.println("Maximum number is: " + findMax(arr));
    }

    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume first element is max

        // Loop through array to find actual max
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a bigger number is found
            }
        }
        return max;
    }
}


