// Task
// Given an integer, , perform the following conditional actions:

// If  is odd, print Weird
// If  is even and in the inclusive range of  to , print Not Weird
// If  is even and in the inclusive range of  to , print Weird
// If  is even and greater than , print Not Weird
// Complete the stub code provided in your editor to print whether or not  is weird.

// Input Format

// A single line containing a positive integer, .

// Constraints

// Output Format

// Print Weird if the number is weird; otherwise, print Not Weird.
// 3-->weird;24-->not weird

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if(n % 2 != 0)
    {
        System.out.print("Weird");
    }
    else
    {
        if(2<=n && n <= 5)
        {
            System.out.print("Not Weird");
        }
        else if(6 <= n && n<= 20)
        {
            System.out.print("Weird");
        }
        else if(n > 20)
        {
            System.out.print("Not Weird");
        }
    }
    }
}
