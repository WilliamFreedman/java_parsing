// TestFile7.java
public class TestFile7 {
    public void simpleMethod1() {
        System.out.println("No recursion here.");
    }

    public void simpleMethod2() {
        simpleMethod1(); // No recursion
    }

    public void mainMethod() {
        simpleMethod2(); // No recursion in any method
    }
}
