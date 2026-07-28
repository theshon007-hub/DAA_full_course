import java.util.*;
class Experiment03_Factorial {

    static int iterative(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++)
            fact *= i;

        return fact;
    }

    static int recursive(int n) {

        if (n == 0 || n == 1)
            return 1;

        return n * recursive(n - 1);
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Iterative Factorial = " + iterative(n));
        System.out.println("Recursive Factorial = " + recursive(n));
    }
}