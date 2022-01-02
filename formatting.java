// Java's System.out.printf function can be used to print formatted output.
// The purpose of this exercise is to test your understanding of formatting output using printf.
  
//   Input Format

// Every line of input will contain a String followed by an integer.
// Each String will have a maximum of  alphabetic characters, and each integer will be in the inclusive range from  to .

// Output Format

// In each line of output there should be two columns:
// The first column contains the String and is left justified using exactly  characters.
// The second column contains the integer, expressed in exactly  digits; if the original input has less than three digits, you must pad your output's leading digits with zeroes.
  
//   Each String is left-justified with trailing whitespace through the first  characters.
//   The leading digit of the integer is the  character, and each integer that was less than  digits now has leading zeroes.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String d = "================================";
        System.out.println(d);
        for(int i=0;i<3;i++)
        {
            String s = sc.next();
            String s1 = String.format("%-15s",s);
            int n = sc.nextInt();
            String s2 = String.format("%03d",n);
            System.out.println(s1+s2);
        }
        System.out.println(d);
    }
}
