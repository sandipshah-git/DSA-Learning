// 	Factorial using iteration
// Given n, compute n!
// Example: 5 → 120  (5! → 1 × 2 × 3 × 4 × 5)
// Iterative = Using a loop (for, while) to repeat a process again and again.

public class factorial_7 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Factorial (Iterative): " + factorialIterative(n));
    }

    public static int factorialIterative(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;  // fact = fact * i
        }
        return fact;
    }
}


