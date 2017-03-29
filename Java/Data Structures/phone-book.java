//https://www.hackerrank.com/challenges/phone-book
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
   public static void main(String []argh)
   {
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       sc.nextLine();
        Map<String, Integer> phoneBook = new HashMap<>();
       for(int i=0;i<n;i++)
           {
           phoneBook.put(sc.nextLine(),sc.nextInt());
           sc.nextLine();
       }
      // String s="";
       while(sc.hasNext())
         {
             String query = sc.nextLine();
           System.out.println(phoneBook.containsKey(query) ? query+"="+phoneBook.get(query) : "Not found");
         }
            
    // System.out.print(s);     
       }
}
