//https://www.hackerrank.com/challenges/java-stack?h_r=next-challenge&h_v=zen
import java.util.*;
class Solution{
   
   public static void main(String []argh)
   {
      Scanner sc = new Scanner(System.in);
     
       
      while (sc.hasNext()) {
         String input=sc.next();
            //Complete the code
          System.out.println(isBalance(input)?"true":"false");
      }
      
   }
    public static boolean isBalance(String s)
        {
         Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++)
            {
            if(s.charAt(i)=='(')
                st.push('(');
            else if(s.charAt(i)=='{')
                st.push('{');
            else if(s.charAt(i)=='[')
                st.push('[');
           else if (s.charAt(i) == ')') {
               if (st.isEmpty()) return false;
               if (st.pop() != '(') return false;
           }
           else if (s.charAt(i) == '}') {
               if (st.isEmpty()) return false;
               if (st.pop() != '{') return false;
           }
           else if (s.charAt(i) == ']') {
               if (st.isEmpty()) return false;
               if (st.pop() != '[') return false;
           }
         }
         return st.isEmpty();
    }
}
/*
Input:
{}()
({()})
{}(
[]

Output:
true
true
false
true
