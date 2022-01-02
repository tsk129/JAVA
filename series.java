// We use the integers , , and  to create the following series:

// You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

// Input Format

// The first line contains an integer, , denoting the number of queries.
// Each line  of the  subsequent lines contains three space-separated integers describing the respective , , and  values for that query.

// Constraints

// Output Format

// For each query, print the corresponding series on a new line. Each series must be printed in order as a single line of  space-separated integers.
  
//   2
// 0 2 10
// 5 3 5
//   2 6 14 30 62 126 254 510 1022 2046
// 8 14 26 50 98
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            int res = a;
            for(int j=0;j<n;j++)
            {
                double temp = Math.round(Math.pow(2,j));
                res += temp*b;
                System.out.print(res+" ");
            }
            System.out.println();
        }
    }
}
