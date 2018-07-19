/*
Consider a staircase of size n=4 :

   #
  ##
 ###
####
Observe that its base and height are both equal to , and the image is drawn using # symbols and spaces. The last line is not preceded by any spaces.

Write a program that prints a staircase of size n .

Input Format

A single integer,n , denoting the size of the staircase.

Output Format

Print a staircase of size   n using # symbols and spaces.

Note: The last line must have 0 spaces in it.

Sample Input

6

Sample Output

     #
    ##
   ###
  ####
 #####
######
Explanation

The staircase is right-aligned, composed of # symbols and spaces, and has a height and width of n=6.
 */

package solutions.hackerrank.algorithms;
import java.util.*;
public class staircase {
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                if ((i + j) > n)
                    System.out.print("#");
                else
                    System.out.print(" ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        staircase(n);

        scanner.close();
    }


}
