/*
Given an array of integers, calculate the fractions of its elements that are positive, negative, and are zeros. Print the decimal value of each fraction on a new line.

Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though answers with absolute error of up to  are acceptable.

Input Format

The first line contains an integer, , denoting the size of the array.
The second line contains  space-separated integers describing an array of numbers .

Output Format

You must print the following  lines:

A decimal representing of the fraction of positive numbers in the array compared to its size.
A decimal representing of the fraction of negative numbers in the array compared to its size.
A decimal representing of the fraction of zeros in the array compared to its size.
Sample Input

6
-4 3 -9 0 4 1
Sample Output

0.500000
0.333333
0.166667
 */
package solutions.hackerrank.algorithms;

import  java.io.*;
import java.math.*;
import java.util.*;
public class plusminus {



        // Complete the plusMinus function below.
        static void plusMinus(int[] arr) {
            double pos = 0.0, neg = 0.0, zero = 0.0;
            double a,b,c;
            int n = arr.length;
            for(int i = 0; i < arr.length; i++ )
            {
                if(arr[i] < 0)
                    neg++;
                else if(arr[i] == 0 )
                    zero++;
                else
                    pos++;
            }

            System.out.println(pos / n);
            System.out.println(neg / n);
            System.out.println(zero / n);




        }


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {

                arr[i] = scanner.nextInt();
            }

            plusMinus(arr);

            scanner.close();
        }
    }



