/*
Anna and Brian order items at a restaurant, but Anna declines to eat any of the kth item(where 0<=k<=n) due to an allergy. When the check comes, they decide to split the cost of all the items they shared; however, Brian may have forgotten that they didn't split the kth item and accidentally charged Anna for it.

You are given n, k, the cost of each of the n items, and the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print Bon Appetit; otherwise, print the amount of money that Brian must refund to Anna.
Bon App&eacute;tit Hackerrank
Sample Input 0

4 1
3 10 2 9
12
Sample Output 0


5
Explanation 0
Anna didn&rsquo;t eat item c[1]=10, but she shared the rest of the items with Brian. The total cost of the shared items is 3+2+9=14 and, split in half, the cost per person is bactual=7. Brian charged her bcharged=12 for her portion of the bill, which is more than the 7 dollars worth of food that she actually shared with him. Thus, we print the amount Anna was overcharged, bcharged-bactual=12-7=5, on a new line.

Sample Input 1

4 1
3 10 2 9
7
Sample Output 1

Bon Appetit
Explanation 1
Anna didn&rsquo;t eat item c[1]=10, but she shared the rest of the items with Brian. The total cost of the shared items is 3+2+9=14 and, split in half, the cost per person is bactual=7. Because this matches the amount, bcharged=7, that Brian charged Anna for her portion of the bill, we print Bon Appetit on a new line.

*/
package solutions.hackerrank.algorithms;
import java.util.*;

public class bonAppetite {
    static void bonAppetit(int bill[], int k, int b) {
        int sum = 0;
        for(int i = 0 ; i < bill.length ; i++)
        {   if(i != k){
            sum += bill[i];
        }
        }
        sum = sum/2;
        if(b - sum == 0)
            System.out.println("Bon Appetit");
        else
            System.out.println(b-sum);
    }

    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] bill= new int[n];
        for (int i = 0; i < n; i++) {
            bill [i]  = sc.nextInt();
        }

        int b = sc.nextInt();
        bonAppetit(bill, k, b);

    }
}
