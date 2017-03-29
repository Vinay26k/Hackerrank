import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> arrays = new ArrayList<>();
         int n = sc.nextInt();
        for(int i=0;i<n;i++) // rows
            {
            int d = sc.nextInt(); // number of elements i.e, columns
             ArrayList <Integer> arr = new ArrayList<>();
            for(int j=0;j<d;j++)
                {
                arr.add(sc.nextInt());
            }
            arrays.add(arr);
        }
        int q = sc.nextInt(); // queries
        for(int i=0;i<q;i++)
            {
            int x = sc.nextInt();
            int y = sc.nextInt();
          //  ArrayList<Integer> arr = arrays.get(x-1);
            try
            {
                //System.out.println(arr.get(y-1));
                System.out.println(arrays.get(x - 1).get(y - 1));
            }
            catch(IndexOutOfBoundsException  e)
                {
                System.out.println("ERROR!");
        }
            
        }
    }
}
/*
Input:                                                 
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Output:
74
52
37
ERROR!
ERROR!
*/
