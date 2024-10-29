// File5.java
public class File5 {

    // Double recursion (recursive calls within recursive calls)
    public int doubleRecursion(int n) {
        if (n <= 1) {
            return 1;
        }
        return doubleRecursion(n - 1) + doubleRecursion(n - 2); // Two recursive calls
    }

    // Iterative Fibonacci
    public int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int prev = 0, curr = 1;
        for (int i = 2; i <= n; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // Hybrid method with iteration and recursion
    public int hybridFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return iterativeFibonacci(n - 1) + doubleRecursion(n - 2); // Combination of recursion and iteration
    }
}
