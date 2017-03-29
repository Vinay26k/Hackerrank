import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++) //testcases
            {
          
            int n = sc.nextInt(); // number of elements
            int m = sc.nextInt(); // number of jumps can make
            int [] a = new int[n];
            for(int j=0;j<n;j++)
                {
                a[j] = sc.nextInt();
            }
           System.out.println(solvable(a,m,0)?"YES":"NO");
        }
    }
    private static boolean solvable(int [] array, int m, int i) {
    /* Base Cases */
    if (i < 0 || array[i] == 1) {
        return false;
    } else if (i + 1 >= array.length || i + m >= array.length) {
        return true;
    }
        
    array[i] = 1; // marks as visited

    /* Recursive Cases */
    return solvable(array, m, i - 1) || 
           solvable(array, m, i + 1) || 
           solvable(array, m, i + m);
}
}
