// We define the following:

// A subarray of an -element array is an array composed from a contiguous block of the original array's elements. For example, if , then the subarrays are , , , , , and . Something like  would not be a subarray as it's not a contiguous subsection of the original array.
// The sum of an array is the total sum of its elements.
// An array's sum is negative if the total sum of its elements is negative.
// An array's sum is positive if the total sum of its elements is positive.
// Given an array of  integers, find and print its number of negative subarrays on a new line.

// Input Format

// The first line contains a single integer, , denoting the length of array .
// The second line contains  space-separated integers describing each respective element, , in array .

// Constraints

// Output Format

// Print the number of subarrays of  having negative sums.


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int l = 1,c = 0;
        while(l<=n)
        {
            for(int i=0;i<n;i++)
            {
                int temp = 0,j=i,dc=0;
                while(j<n && j<i+l)
                {
                    temp += arr[j];
                    j++;
                    dc++;
                }
                if(temp<0 && dc == l)
                {
                    c += 1;
                }
            }
            l++;
        }
        System.out.println(c);
    }
}
