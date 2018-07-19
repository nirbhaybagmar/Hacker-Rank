/*
Calculate and print the sum of the elements in an array, keeping in mind that some of those integers may be quite large.

Input Format

The first line of the input consists of an integer .
The next line contains  space-separated integers contained in the array.

Output Format

Print the integer sum of the elements in the array.
 */
package solutions.hackerrank.algorithms;
import java.util.*;
import java.io.*;

public class a_very_big_sum {
    static long aVeryBigSum(long[] ar) {
        long sum = 0;
        for(int i = 0; i < ar.length; i++)
        {
            sum = sum + ar[i];
        }
        return sum;

    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int arCount = scanner.nextInt();
        long[] ar = new long[arCount];
        String[] arItems = scanner.nextLine().split(" ");
        for (int i = 0; i < arCount; i++) {
            ar[i] = scanner.nextLong();
        }
        long result = aVeryBigSum(ar);
        System.out.println(result);
        scanner.close();
    }
}


