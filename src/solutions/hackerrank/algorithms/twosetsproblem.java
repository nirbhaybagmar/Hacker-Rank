/*
Consider two sets of positive integers, A={a0, a1, ..., a(n-1)} and B={b0, b1, ..., b(m-1)} . We say that a positive integer, x, is between sets A and B if the following conditions are satisfied:

All elements in A are factors of x. And x is a factor of all elements in B. Given A and B, find and print the number of integers (i.e., possible 's) that are between the two sets.

Input Format

The first line contains two space-separated integers describing the respective values of n (the number of elements in set A) and m (the number of elements in set B). The second line contains distinct space-separated integers describing a0, a1, ..., a(n-1). The third line contains distinct space-separated integers describing b0, b1, ..., b(m-1).

Constraints

1<= n, m <= 10

1<= a(i) <= 100

1<= b(i) <= 100

Output Format

Print the number of integers that are considered to be between A and B.

Sample Input

2 3

2 4

16 32 96

Sample Output

3

Explanation

The integers that are between A={2, 4} and B={16, 32, 96} are 4, 8, and 16.
 */
package solutions.hackerrank.algorithms;
import java.util.*;
public class twosetsproblem {
    static boolean getTotalX(int Ax, int[] b) {

        for(int i=0; i<b.length; i++){
            if(b[i] % Ax != 0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner   scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] a = new int[n];

        for (int aItr = 0; aItr < n; aItr++) {
            a[aItr] = scan.nextInt();
        }
        int[] b = new int[m];
        for (int bItr = 0; bItr < m; bItr++) {
            b[bItr] = scan.nextInt();
        }

        boolean c = false;
        int count=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int Ax = 0;
                Ax = a[i]*a[j];
                //check if Ax is satisfied for all elements in B
                c = getTotalX(Ax, b);
                if (c == true){
                    count++;
                }


            }
        }
        System.out.println( count ) ;
    }
}
