import java.lang.Math;
import java.util.ArrayList;

public class Maths {

    // count digits which perfectly divides n;
    static int countDigits(int n) {
        int temp = n;
        int count = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;

            if (lastDigit != 0 && n % lastDigit == 0) {
                count++;
            }
            temp = temp / 10;

        }
        return count;
    }

    static int reverseNumber(int n) {
        int temp = n;
        int newNumber = 0;
        while (temp > 0) {
            // 78090
            // 987

            int lastDigit = temp % 10;
            temp = temp / 10;
            if (lastDigit != 0 && newNumber == 0) {
                newNumber = lastDigit;
                continue;
            }
            newNumber = newNumber * 10 + lastDigit;

        }
        return newNumber;
    }

    static boolean isPalindrome(int n) {
        int reverse = reverseNumber(n);
        if (reverse == n) {
            return true;
        }
        return false;
    }

    // is sum of cube of each digit is equal to number
    static boolean isArmstrongNumber(int n) {
        int temp = n;
        int newNumber = 0;
        while (temp > 0) {

            int lastDigit = temp % 10;
            temp = temp / 10;

            newNumber = (int) (newNumber + Math.pow(lastDigit, 3));

        }
        return newNumber == n;
    }

    static void printAllDivisors(int n) {
        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }

    static void printAllDivisors_O(int n) {
        int i = 1;
        int sqrt = (int) Math.sqrt(n);
        ArrayList<Integer> arr = new ArrayList<>();
        while (i <= sqrt) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (n / i != i) {
                    arr.add(n / i);
                }
            }
            i++;
        }
        for (int j = arr.size() - 1; j >= 0; j--) {
            System.out.print(arr.get(j) + " ");
        }
    }

    static boolean checkPrime(int n) {
        int i = 1, count = 0;
        int sqrt = (int) Math.sqrt(n);
        while (i <= sqrt) {
            if (n % i == 0) {
                count++;
                if (n / i != i) {
                    count++;
                }
            }
            if (count > 2)
                return false;
            i++;
        }
        return count <= 2;

    }

    static int checkHcf(int n, int m) {
        int min = Math.min(n, m);
        int i = 1;
        int hfc = 1;
        while (i <= min) {
            if (n % i == 0 && m % i == 0) {
                hfc = i;
            }

            i++;
        }
        return hfc;
    }

    static int checkHcf_EuclideanAlgo(int n, int m) {
        if (m == 0) {
            return n;
        }

        return checkHcf_EuclideanAlgo(m, n % m);

    }

    public static void main(String[] args) {
        System.out.println(checkHcf(20, 40));
        // printAllDivisors_O(36);
    }
}