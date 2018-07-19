/*
Function description

Complete the Diagnol Difference function in the editor below. It must return an integer representing the absolute diagonal difference.

diagonalDifference takes the following parameter:

arr: an array of integers .
Input Format

The first line contains a single integer, n, the number of rows and columns in the matrix a.
Each of the next n lines describes a row,a[i] , and consists of  space-separated integers a[i][j].



Output Format

Print the absolute difference between the sums of the matrix's two diagonals as a single integer.


 */
package solutions.hackerrank.algorithms;
import java.io.*;
import java.util.*;
public class diagnoldifference {
    static int diagonalDifference(int[][] arr,int n) {
        int d1 = 0, d2 = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i == j)
                    d1 += arr[i][j];
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }

        return Math.abs(d1 - d2);
    }
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int result = diagonalDifference(arr,n);
        System.out.println(result);
        scanner.close();
    }
}
