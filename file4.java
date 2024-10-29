// File4.java
public class File4 {

    // Tail recursive method
    public int tailRecursiveSum(int n, int acc) {
        if (n == 0) {
            return acc;
        }
        return tailRecursiveSum(n - 1, acc + n);
    }

    // Iterative method with recursion inside iteration
    public void iterativeWithRecursion(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Recursion result for " + i + ": " + tailRecursiveSum(i, 0)); // Call to recursive method
        }
    }

    // Simple iterative method
    public void simpleIteration(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("i: " + i);
        }
    }
}
