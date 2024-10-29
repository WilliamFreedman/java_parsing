// File3.java
public class File3 {

    // Recursive method
    public int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Iterative method with while loop
    public void iterativeWhileLoop(int n) {
        int i = 0;
        while (i < n) {
            System.out.println(i);
            i++;
        }
    }

    // Method combining recursion and iteration
    public void combineRecursionAndIteration(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Factorial of " + i + " is: " + factorial(i)); // Recursive call inside iteration
        }
    }
}
