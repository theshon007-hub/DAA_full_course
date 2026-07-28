import java.util.*;
class Experiment04_Fibonacci {

    static int recursiveFib(int n) {

        if (n <= 1)
            return n;

        return recursiveFib(n - 1) + recursiveFib(n - 2);
    }

    public static void main(String[] args) {

        int n = 6;

        System.out.print("Iterative: ");

        int a = 0, b = 1;

        for (int i = 0; i < n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();

        System.out.print("Recursive: ");

        for (int i = 0; i < n; i++)
            System.out.print(recursiveFib(i) + " ");
    }
}