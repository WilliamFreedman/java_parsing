// TestFile5.java
public class TestFile5 {
    public void overloadedMethod(int x) {
        overloadedMethod(); // Calls overloaded method with no arguments
    }

    public void overloadedMethod() {
        overloadedMethod(5); // Calls overloaded method with arguments (indirect recursion)
    }

    public void mainMethod() {
        overloadedMethod(); // Indirect recursion through overloaded methods
    }
}
