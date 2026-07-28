import java.util.*;
public class Experiment14_Exponentiation {

    static long power(long x, long n) {

        if (n == 0)
            return 1;

        long half = power(x, n / 2);

        if (n % 2 == 0)
            return half * half;
        else
            return x * half * half;
    }

    public static void main(String[] args) {

        int x = 2;
        int n = 10;

        System.out.println(x + "^" + n + " = " + power(x, n));
    }
}