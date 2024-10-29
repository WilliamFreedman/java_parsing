// TestFile6.java
public class TestFile6 {
    public void method1() {
        method2(); // Calls another method
    }

    public void method2() {
        method3(); // Calls another method
    }

    public void method3() {
        method1(); // Indirect recursion, calls method1
    }

    public void mainMethod() {
        method1(); // Starts mutual recursion through method1, method2, and method3
    }
}
