/*
Problem:- apple and orange hackerrank solution or Apple and Orange solution or Apple and Orange solution in C++ or Apple and Orange hacker rank solution in Java or Apple and Orange hacker rank solution c++ or Apple and Orange hacker rank solution c++ or Apple and Orange program in c or Apple and Orange solution in c or Apple and Orange hacker rank solution in python or Apple and Orange in java or Apple and Orange hacker rank solution in c or Hacker Rank Solution For Apple and Orange in C++ or Apple and Orange in C++ or Hacker Rank solution for Apple and Orange Pairs in C++.

Check This- Hacker rank Solution for C++ Sub Domain Introduction, Classes, STL, Inheritance.

Logic:- divisible pairs sum problem has no logic just put the condition as problem requirement, see the below explanation section for full understanding.

Explanation:- Let's take an example of hacker rank and try to solve the problem step by step. Below is a hacker rank input and we are implementing hacker input for better understanding.

7 11
5 15
3 2
-2 2 1
5 -6

So according to our solution just fit the above input in our solution.
s = 7
t = 11
a = 5
b = 15
m = 3
n = 2
Now remaining last two line input is for an apple falls and an orange falls.
An apple falls(ap) = -2, 2, 1
An orange falls(ora) = 5, -6

Example:- Now put all these inputs in condition
Here is an answer of an apple falls = 1.
Here is an answer of an orange falls = 1.

 */
package solutions.hackerrank.algorithms;
import java.util.*;

public class appleandorange {
    static int count1 = 0 ;
    static int count2 = 0 ;
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        for( int i = 0 ; i < apples.length ; i++)
        {
            if(apples[i] > 0 )
            {
                if( (a + apples[i]) >= s && (a + apples[i]) <= t ){
                    count1++ ;

                }
            }
        }
        for( int j = 0 ; j < oranges.length ; j++)
        {
            if(oranges[j] < 0 )
            {
                if( (b  - Math.abs(oranges[j])) >= s && (b - Math.abs(oranges[j])) <= t )                      {
                    count2++;

                }
            }
        }
        System.out.println( count1 );
        System.out.println( count2 );

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int s = scanner.nextInt();
        int t = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] apples = new int[m];
        for (int i = 0; i < m; i++) {
            apples[i] = scanner.nextInt();
        }
        int[] oranges = new int[n];
        for (int i = 0; i < n; i++) {
            oranges[i] = scanner.nextInt();
        }
        countApplesAndOranges(s, t, a, b, apples, oranges);
        scanner.close();
    }
}
