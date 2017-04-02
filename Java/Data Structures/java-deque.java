   //https://www.hackerrank.com/challenges/java-dequeue
   import java.util.*;
    public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque <Integer> deque = new ArrayDeque<>();
            int n = in.nextInt();
            int m = in.nextInt();
            HashSet <Integer> hs = new HashSet<>();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                int num = in.nextInt();
               deque.add(num);
                hs.add(num);
                if(deque.size()==m) // check after every three elements in deque
                    {
                    if(hs.size()>max) //add new maximum value
                        max = hs.size();
                    int head = deque.remove();// removes head and stores in head variable
                    if(!deque.contains(head))
                        hs.remove(head);
                }
            }
            System.out.println(max);
        }
    }
/*
Sample Input
6 3
5 3 5 2 3 2

Sample Output
3
*/
