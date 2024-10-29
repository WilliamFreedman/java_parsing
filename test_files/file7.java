// File7.java
public class File7 {

    // Recursive factorial
    public int recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }

    // Iterative sum with a while loop
    public int iterativeSum(int n) {
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        return sum;
    }

    // Combination of recursion and iteration
    public int recursiveSumWithIteration(int n) {
        return recursiveFactorial(n) + iterativeSum(n); // Recursion + iteration
    }
}
