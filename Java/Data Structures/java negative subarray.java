import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int[] a = new int[sc.nextInt()];

    a[0] = sc.nextInt();
    int count = a[0] < 0 ? 1 : 0;
    for (int i = 1; i < a.length; i++){
        int num = sc.nextInt();
        a[i] = a[i - 1] + num;

        if (a[i] < 0){
            count++;
        }

        for (int j = 0; j < i; j++){
            int sub_result = a[i] - a[j];
            if (sub_result < 0){
                count++;
            }
        }
    }

    System.out.print(count);
    }
}
