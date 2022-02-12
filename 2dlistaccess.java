// Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

// You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

// Take your input from System.in.

// Input Format
// The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

// Constraints

// Each number will fit in signed integer.
// Total number of integers in  lines will not cross .

// Output Format
// In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] si = new int[n];
        List<List> arr = new ArrayList<List>();
        for(int i=0;i<n;i++)
        {
            si[i] = sc.nextInt();
            List d1 = new ArrayList();
            for(int j=0;j<si[i];j++)
            {
                d1.add(sc.nextInt());
            }
            arr.add(d1);
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++)
        {
            int u = sc.nextInt();
            int v = sc.nextInt()-1;
            // System.out.println(String.format("%d %d %d %d",u,v,si[u-1],n));
            if(u-1<n && v<si[u-1])
            {
                System.out.println(arr.get(u-1).get(v));
            }
            else
            {
                System.out.println("ERROR!");
            }
        }
    }
}
