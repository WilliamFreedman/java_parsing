// TestFile1.java
public class TestFile1 {
    public void directRecursiveMethod() {
        directRecursiveMethod(); // Direct recursion
    }

    public void mainMethod() {
        directRecursiveMethod(); // Calls directly recursive method
    }
}
