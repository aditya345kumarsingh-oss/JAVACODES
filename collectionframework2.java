import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class collectionframework2 {
    public static void main(String[] args) {
        Queue <Integer> a= new LinkedList<>();
        //insertion
        //add()- inserts the specific element in queue 
        // a.add(23);   
        // a.add(24);
        // a.add(25);
        // a.add(26);


  // offer()-- it return TRUE if it offer or false same as add 
        a.offer(23);
        a.offer(24);
        a.offer(25);
        a.offer(26);
        System.out.println(a);

        // peek()- return the head of the queue

     System.out.println("head:" + a.peek() );

    // poll()- remove the first element 
    System.out.println("removing:" + a.poll() );



    Queue <Integer> b= new PriorityQueue<>();

        b.offer(23);
        b.offer(24);
        b.offer(25);
        b.offer(26);
        System.out.println(b);  
//in priorityqueue it will remove less value or minimum value ..,minheap case for integer

         System.out.println("remove:"+ b.poll()); 
         System.out.println(b);   


         //set-- no dublicasi 

         //HashSet-- commonly use to access the data, no duplicate value ,unique identity O(1)
         //linkedhashset-- give same order O(n)
         //treeset--  give sorted order  O(logn)
          Set <Integer> c= new HashSet<>();
          Set <Integer> c2= new HashSet<>();
         c.add(23);   
         c.add(24);
         c.add(25);
         c.add(26);
// every keyword is same as previous program 
         c2.add(22);   
         c2.add(24);
         c2.add(2);
         c2.add(26);
         //retainall means it return commone value in set....intersection
         System.out.println("set:"+c);
         c.retainAll(c2);
         System.out.println("set:"+c);
          System.out.println("set:"+c2);
//containall retun true or false if same value is there
 System.out.println(c2.containsAll(c));

        






      
        
    }
    
}
