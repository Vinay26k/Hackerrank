//https://www.hackerrank.com/challenges/java-list?h_r=next-challenge&h_v=zen
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
            {
            list.add(sc.nextInt());
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++)
            {
            String s = sc.next();
            if(s.equals("Insert"))
                {
                list.add(sc.nextInt(),sc.nextInt());
            }
            else
                list.remove(sc.nextInt());
        }
        String result ="";
        for(int i:list)
          result += Integer.toString(i) + " ";
        System.out.println(result);
    }
}
