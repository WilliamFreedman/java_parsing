// File2.java
public class File2 {

    // Mutually recursive methods
    public boolean isEven(int n) {
        if (n == 0) return true;
        return isOdd(n - 1); // Calls the mutually recursive isOdd
    }

    public boolean isOdd(int n) {
        if (n == 0) return false;
        return isEven(n - 1); // Calls the mutually recursive isEven
    }

    // Nested iteration
    public void nestedIteration(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }
    }
}
