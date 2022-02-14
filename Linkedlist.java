// For this problem, we have  types of queries you can perform on a List:

// Insert  at index :

// Insert
// x y
// Delete the element at index :

// Delete
// x
// Given a list, , of  integers, perform  queries on the list. Once all queries are completed, print the modified list as a single line of space-separated integers.

// Input Format

// The first line contains an integer,  (the initial number of elements in ).
// The second line contains  space-separated integers describing .
// The third line contains an integer,  (the number of queries).
// The  subsequent lines describe the queries, and each query is described over two lines:

// If the first line of a query contains the String Insert, then the second line contains two space separated integers , and the value  must be inserted into  at index .
// If the first line of a query contains the String Delete, then the second line contains index , whose element must be deleted from .
// Constraints



// Each element in is a 32-bit integer.
// Output Format

// Print the updated list  as a single line of space-separated integers.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> arr = new LinkedList<Integer>();
        for(int i=0;i<N;i++)
        {
            arr.add(i,sc.nextInt());
        }
        int Q = sc.nextInt();
        for(int i=0;i<Q;i++)
        {
            String query = sc.next();
            sc.nextLine();
            if(query.equals("Insert"))
            {
                int a = sc.nextInt();
                int b = sc.nextInt();
                if(a==arr.size())
                {
                    arr.addLast(b);
                }
                else
                {
                    arr.add(a,b);
                }
            }
            else
            {
                int a = sc.nextInt();
                arr.remove(a);
            }
        }
        for(int i=0;i<arr.size();i++)
        {
            System.out.print(arr.get(i)+" ");
        }
    }
}
