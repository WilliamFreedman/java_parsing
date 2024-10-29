// File6.java
public class File6 {

    // Mutual recursion example 2
    public boolean mutualA(int n) {
        if (n == 0) return true;
        return mutualB(n - 1); // Calls mutualB
    }

    public boolean mutualB(int n) {
        if (n == 0) return false;
        return mutualA(n - 1); // Calls mutualA
    }

    // Iteration with complex condition
    public void iterationWithComplexCondition(int n) {
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                System.out.println("Even: " + i);
            } else {
                System.out.println("Odd: " + i);
            }
        }
    }
}
