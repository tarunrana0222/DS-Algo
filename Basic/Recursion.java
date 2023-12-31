package Basic;

import java.lang.Math;
import java.util.ArrayList;

public class Recursion {
    static void addElements(int[] arr, int x) {
        if (x == 0) {
            return;
        }
        arr[x - 1] = x;
        addElements(arr, x - 1);
    }

    public static int[] printNos(int x) {
        int[] arr = new int[x];
        addElements(arr, x);
        return arr;
    }

    static int sumXNumbers(int x) {
        if (x == 1) {
            return 1;
        }
        return x + sumXNumbers(x - 1);
    }

    static int factorialN(int n) {
        if (n == 1) {
            return 1;
        }
        return n * factorialN(n - 1);
    }

    public static void main(String[] args) {
        // int[] arr = printNos(5);
        // for (int i : arr) {
        // System.out.println(i);
        // }

        System.out.println(factorialN(3));
    }
}
