/*
HackerLand University has the following grading policy:

Every student receives a  in the inclusive range from 0  to 100 .
Any  less than  40 is a failing grade.
Sam is a professor at the university and likes to round each student's  according to these rules:

If the difference between the  grade and the next multiple of 5 is less than 3, round  up to the next multiple of 5.
If the value of grade is less than 38, no rounding occurs as the result will still be a failing grade.
For example, grade = 84 will be rounded to 85   but grade = 37 will not be rounded because the rounding would result in a number that is less than 40 .

Given the initial value of  for each of Sam's  students, write code to automate the rounding process. Complete the function solve that takes an integer array of all grades, and return an integer array consisting of the rounded grades. For each , round it according to the rules above and print the result on a new line.

Input Format

The first line contains a single integer denoting  (the number of students).
Each line  of the  subsequent lines contains a single integer, , denoting student 's grade.

Constraints

Output Format

For each  of the  grades, print the rounded grade on a new line.

Sample Input 0

4
73
67
38
33
Sample Output 0

75
67
40
33
 */
package solutions.hackerrank.datastructures.arrays;
import java.util.*;
public class gradingstudents {
    static int[] gradingStudents(int[] grades) {
        for( int i = 0 ; i < grades.length ; i++)
        {
            if(grades[i] > 37){
                if( 5 - ( grades[i]  % 5) < 3 )
                {
                    grades[i] =  5 * (grades[i]/5) + 5;

                }
            }
        }
        return grades ;
    }
    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] grades = new int[n];
        for (int i = 0 ; i < n; i++) {
            grades[i] = scan.nextInt();
        }

        int[] result = gradingStudents(grades);

        for (int j = 0; j < result.length; j++) {
            System.out.println(result[j]);


        }


    }
}
