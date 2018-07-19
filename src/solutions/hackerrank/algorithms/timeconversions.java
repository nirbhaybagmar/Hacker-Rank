/*
Given a time in -hour AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.

Input Format

A single string  containing a time in 12-hour clock format
Output Format

Convert and print the given time in 24-hour format, where .

Sample Input 0

07:05:45PM
Sample Output 0

19:05:45
 */
package solutions.hackerrank.algorithms;
import java.util.*;

public class timeconversions {
    static void timeConversion(String s) {
        String temp [] = s.split(":");
        String hours = temp[0] ;
        String min = temp[1] ;
        String sec = temp[2].substring(0,2) ;
        int temph;
        if( temp[2].substring(2,4).equals("PM"))
        {
            if(Integer.parseInt(hours) < 12)
            {
                temph = Integer.parseInt(hours);
                temph += 12;
                hours = Integer.toString(temph);
            }

        }
        System.out.println(hours + ":" + min + ":"+ sec);



    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        timeConversion(s);
    }
}

