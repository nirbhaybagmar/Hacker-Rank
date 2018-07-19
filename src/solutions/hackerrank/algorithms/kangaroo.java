/*
You are choreographing a circus show with various animals. For one act, you are given two kangaroos on a number line ready to jump in the positive direction (i.e, toward positive infinity).

The first kangaroo starts at location  and moves at a rate of  meters per jump.
The second kangaroo starts at location  and moves at a rate of  meters per jump.
You have to figure out a way to get both kangaroos at the same location as part of the show.

Complete the function kangaroo which takes starting location and speed of both kangaroos as input, and return  or appropriately. Can you determine if the kangaroos will ever land at the same location at the same time? The two kangaroos must land at the same location after making the same number of jumps.

Input Format

A single line of four space-separated integers denoting the respective values of , , , and .

Constraints

Output Format

Print YES if they can land on the same location at the same time; otherwise, print NO.

Note: The two kangaroos must land at the same location after making the same number of jumps.

Sample Input 0

0 3 4 2
Sample Output 0

YES
 */
package solutions.hackerrank.algorithms;
import java.util.*;
public class kangaroo {
    public static void kangaroo(int x1,  int v1, int x2 , int v2)
    {
        if(v2 >= v1) {
            System.out.println("NO");
        }
        else
        if((x2-x1)%(v1-v2) == 0)
        {
            System.out.println("YES");

        }
        else {
            System.out.println("NO");

        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        int x1 = scanner.nextInt();
        int v1 =  scanner.nextInt();
        int x2 =  scanner.nextInt();
        int v2 =  scanner.nextInt();
        kangaroo(x1, v1, x2, v2);
    }
}
