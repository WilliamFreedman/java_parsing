// TestFile4.java
public class TestFile4 {
    public void methodX() {
        methodY(); // Calls another method
    }

    public void methodY() {
        methodZ(); // Calls another method
    }

    public void methodZ() {
        methodX(); // Indirect recursion through multiple levels
    }

    public void mainMethod() {
        methodX(); // Indirect recursion through methodX, methodY, and methodZ
    }
}
