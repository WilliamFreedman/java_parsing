// File1.java
public class File1 {

    // Iterative method
    public void iterativeMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // Recursive method
    public int recursiveMethod(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveMethod(n - 1) + recursiveMethod(n - 2);
    }

    // Mixed method with nested iteration and recursion
    public void mixedMethod(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Iteration: " + i);
            if (i % 2 == 0) {
                recursiveMethod(i); // Call to a recursive method within iteration
            }
        }
    }
}
