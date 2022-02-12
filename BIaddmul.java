// In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.

// Use the power of Java's BigInteger class and solve this problem.

// Input Format

// There will be two lines containing two numbers,  and .

// Constraints

//  and  are non-negative integers and can have maximum  digits.

// Output Format

// Output two lines. The first line should contain , and the second line should contain . Don't print any leading zeros.


import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        BigInteger c = a.add(b);
        BigInteger d = a.multiply(b);
        System.out.println(c);
        System.out.println(d);
    }
}
