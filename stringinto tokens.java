// Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

// Note: You may find the String.split method helpful in completing this challenge.

// Input Format

// A single string, .

// Constraints

//  is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).
// Output Format

// On the first line, print an integer, , denoting the number of tokens in string  (they do not need to be unique). Next, print each of the  tokens on a new line in the same order as they appear in input string .


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String sen = sc.nextLine();
        sen.trim();
        if(sen.length()==0)
        {
            System.out.println("0");
        }
        else if(sen.length()>400000)
        {
            System.out.println();
        }
        else
        {
            String[] spsen = sen.split("[ !,?._'@]+");
            int n = spsen.length;
            System.out.println(n);
            for(int i=0;i<n;i++)
            {
                System.out.println(spsen[i]);
            }
        }
    }
}
