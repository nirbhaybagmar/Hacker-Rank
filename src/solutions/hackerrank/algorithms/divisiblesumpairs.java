package solutions.hackerrank.algorithms;
import java.util.*;
import java.io.*;


public class divisiblesumpairs {

    // Complete the divisibleSumPairs function below.
    static void divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if ((ar[i] + ar[j]) % k == 0) {
                    count += 1;
                }
            }
        }
        System.out.println(count);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = scanner.nextInt();
        }
         divisibleSumPairs(n, k, ar);
        scanner.close();
    }
}

