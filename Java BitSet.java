// Java's BitSet class implements a vector of bit values (i.e.:  () or  ()) that grows as needed, allowing us to easily manipulate bits while optimizing space (when compared to other collections). Any element having a bit value of  is called a set bit.

// Given  BitSets,  and , of size  where all bits in both BitSets are initialized to , perform a series of  operations. After each operation, print the number of set bits in the respective BitSets as two space-separated integers on a new line.

// Input Format

// The first line contains  space-separated integers,  (the length of both BitSets  and ) and  (the number of operations to perform), respectively.
// The  subsequent lines each contain an operation in one of the following forms:

// AND 
// OR 
// XOR 
// FLIP
// SET 
// In the list above,  is the integer  or , where  denotes  and  denotes .
//  is an integer denoting a bit's index in the BitSet corresponding to .

// For the binary operations , , and , operands are read from left to right and the BitSet resulting from the operation replaces the contents of the first operand. For example:

// AND 2 1
//  is the left operand, and  is the right operand. This operation should assign the result of  to .

// Constraints

// Output Format

// After each operation, print the respective number of set bits in BitSet  and BitSet  as  space-separated integers on a new line.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BitSet a = new BitSet(N);
        BitSet b = new BitSet(N);
        BitSet[] bs = new BitSet[3];
        bs[1] = a;
        bs[2] = b; 
        for(int i=0;i<M;i++)
        {
            String op = sc.next();
            int op1 = sc.nextInt();
            int op2 = sc.nextInt();
            switch(op)
            {
                case "AND":
                    bs[op1].and(bs[op2]);
                    break;
                case "OR":
                    bs[op1].or(bs[op2]);
                    break;
                case "XOR":
                    bs[op1].xor(bs[op2]);
                    break;
                case "FLIP":
                    bs[op1].flip(op2);
                    break;
                case "SET":
                    bs[op1].set(op2);
                    break;
            }
            System.out.println(a.cardinality()+" "+b.cardinality());
        }
        
    }
}
