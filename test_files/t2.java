// TestFile2.java
public class TestFile2 {
    public void methodA() {
        methodB(); // Calls another method
    }

    public void methodB() {
        methodA(); // Indirect recursion, calls back methodA
    }

    public void mainMethod() {
        methodA(); // Indirect recursion through methodA and methodB
    }
}
