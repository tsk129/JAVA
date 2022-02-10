// Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
// For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

// A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
// Given a string, , and an integer, , complete the function so that it finds the lexicographically smallest and largest substrings of length .

// Function Description

// Complete the getSmallestAndLargest function in the editor below.

// getSmallestAndLargest has the following parameters:

// string s: a string
// int k: the length of the substrings to find
// Returns

// string: the string ' + "\n" + ' where and are the two substrings
// Input Format

// The first line contains a string denoting .
// The second line contains an integer denoting .

// Constraints

//  consists of English alphabetic letters only (i.e., [a-zA-Z]).


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        
        String smallest = s.substring(0,3);
        String largest = s.substring(0,3);
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        int l = s.length();
        String[] ss = new String[50];
        for(int i=0;i<l-k+1;i++)
        {
            String temp = s.substring(i,i+k);
            if (temp.compareTo(smallest) < 0)
            {
                smallest = temp;
            }
            if (temp.compareTo(largest) > 0) {
                largest = temp;
            }
        }
        
        System.out.println(smallest + "\n" + largest);
    }
}
