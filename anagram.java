// Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For this challenge, the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.

// Function Description

// Complete the isAnagram function in the editor.

// isAnagram has the following parameters:

// string a: the first string
// string b: the second string
// Returns

// boolean: If  and  are case-insensitive anagrams, return true. Otherwise, return false.
// Input Format

// The first line contains a string .
// The second line contains a string .

// Constraints

// Strings  and  consist of English alphabetic characters.
// The comparison should NOT be case sensitive.
  
  
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        if(a.length() != b.length())
        {
            System.out.println("Not Anagrams");
        }
        else
        {
            char[] A = (a.toUpperCase()).toCharArray();
            char[] B = (b.toUpperCase()).toCharArray();
            Arrays.sort(A);
            Arrays.sort(B);
            String c = new String(A);
            String d = new String(B);
            if(c.equals(d))
            {
                System.out.println("Anagrams");
            }
            else
            {
                System.out.println("Not Anagrams");
            }
        }
        
    }
}
