//  Fibonacci Series
//  Print first N Fibonacci numbers.
//  Example: 6 → 0, 1, 1, 2, 3, 5


public class FibonacciSeries_6{
    public static void main(String[] args) {
        int n = 6; // You can change this value to print more numbers
        printFibonacci(n);
    }

    public static void printFibonacci(int n) {
        int first = 0;
        int second = 1;

        // Print first number
        System.out.print(first);

        // Loop starts from 2 because 0 and 1 are already printed logically
        for (int i = 1; i < n; i++) {
            System.out.print(", " + second);
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
