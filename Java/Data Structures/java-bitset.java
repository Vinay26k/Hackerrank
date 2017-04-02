//https://www.hackerrank.com/challenges/java-bitset
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        BitSet bs1 = new BitSet(n);
        BitSet bs2 = new BitSet(n);
        for(int i=0;i<m;i++)
            {
            String op = sc.next();
            //sc.nextLine();
            int a = sc.nextInt();
            int b= sc.nextInt();
            switch(op)
                {
                case "AND":
                    if(a==1)
                        bs1.and(bs2);
                    else
                        bs2.and(bs1);
                    break;
                case "OR":
                    if(a==1)
                        bs1.or(bs2);
                    else
                        bs2.or(bs1);
                    break;
                case "SET":
                    if(a==1)
                        bs1.set(b);
                    else
                        bs2.set(b);
                    break;
                case "FLIP":
                    if(a==1)
                        bs1.flip(b);
                    else
                        bs2.flip(b);
                    break;
                case "XOR":
                    if(a==1)
                        bs1.xor(bs2);
                    else
                        bs2.xor(bs1);
            }
            System.out.println(bs1.cardinality()+" "+bs2.cardinality());
        }
        
    }
}

/*
Sample Input

5 4
AND 1 2
SET 1 4
FLIP 2 2
OR 2 1

Sample Output

0 0
1 0
1 1
1 2
*/
