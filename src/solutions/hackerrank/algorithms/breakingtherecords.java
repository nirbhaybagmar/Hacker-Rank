/*
Maria plays college basketball and wants to go pro. Each season she maintains a record of her play. She tabulates the number of times she breaks her season record for most points and least points in a game. Points scored in the first game establish her record for the season, and she begins counting from there.

For example, assume her scores for the season are represented in the array . Scores are in the same order as the games played. She would tabulate her results as follows:

                                 Count
Game  Score  Minimum  Maximum   Min Max
 0      12     12       12       0   0
 1      24     12       24       0   1
 2      10     10       24       1   1
 3      24     10       24       1   1
Given Maria's array of  for a season of  games, find and print the number of times she breaks her records for most and least points scored during the season.

Input Format

The first line contains an integer n, the number of games.
The second line contains n space-separated integers describing the respective values of .

Constraints

Output Format

Print two space-seperated integers describing the respective numbers of times her best (highest) score increased and her worst (lowest) score decreased.

Sample Input 0

9
10 5 20 20 4 5 2 25 1
Sample Output 0

2 4

 */
package solutions.hackerrank.algorithms;
import java.util.*;
public class breakingtherecords {
    static void breakingRecords(int[] scores) {

        int highest, lowest;
        highest = lowest = scores[0];
        int count1 = 0;
        int count2 = 0;
        for (int s_i = 1; s_i < scores.length; s_i++)
        {
            if (scores[s_i] > highest)
            {
                highest = scores[s_i];
                count1++ ;        }
            else if (scores[s_i] < lowest)
            {
                lowest = scores[s_i];
                count2++ ;        }
        }
        System.out.println(count1 + "\t" + count2);
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
        int n = scanner.nextInt();
        int[] scores = new int[n];
        for (int i = 0; i < n; i++) {
            scores[i] = scanner.nextInt();
        }

        breakingRecords(scores);



    }
}
