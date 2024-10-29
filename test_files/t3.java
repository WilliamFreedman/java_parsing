// TestFile3.java
public class TestFile3 {
    public void nonRecursiveMethod() {
        System.out.println("This method does nothing recursive.");
    }

    public void helperMethod() {
        nonRecursiveMethod(); // Calls non-recursive method
    }

    public void mainMethod() {
        helperMethod(); // No recursion here
    }
}
