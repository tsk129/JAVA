// Java's BigDecimal class can handle arbitrary-precision signed decimal numbers. Let's test your knowledge of them!

// Given an array, , of  real number strings, sort them in descending order — but wait, there's more! Each number must be printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as . If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).

// Complete the code in the unlocked section of the editor below. You must rearrange array 's elements according to the instructions above.

// Input Format

// The first line consists of a single integer, , denoting the number of integer strings.
// Each line  of the  subsequent lines contains a real number denoting the value of .

// Constraints

// Each  has at most  digits.
// Output Format

// Locked stub code in the editor will print the contents of array  to stdout. You are only responsible for reordering the array's elements.

import java.math.BigDecimal;
import java.util.*;
class Solution{

    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
      	sc.close();

        //Write your code here
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                BigDecimal a = new BigDecimal(s[i]);
                BigDecimal b = new BigDecimal(s[j]);
                if(a.compareTo(b)<0)
                {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                }
            }
        }
        //Output
