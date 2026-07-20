import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.LinkedList;


public class collectionframework {
    public static void main(String[] args) {

        //list orr collection --> interface

        //ArrayList-> concrete class
         List<Integer> arr = new ArrayList<>();

         //add 
        arr.add(10);
        arr.add(20);
        arr.add(30);
        System.out.println(arr);
        arr.add( 40);
        System.out.println(arr);

    // remove
        arr.remove(1);
        System.out.println(arr);

        //addAll
        List<Integer> arr2 = new ArrayList<>();
        arr2.add(50);
        arr2.add(60);
        arr.addAll(arr2);
        System.out.println(arr);

        //removeAll 
        arr.removeAll(arr2);
        System.out.println(arr);
        
//size
        System.out.println(arr.size());

        //clear
        System.out.println("print arr2:  " + arr2);
        arr2.clear();
        System.out.println(arr2.size());

        //iterator
        Iterator<Integer> it = arr.iterator();
        while(it.hasNext()){
            System.out.println("element: " + it.next());


            List<Integer> arr3 = new ArrayList<>();
            arr3.add(100);
            arr3.add(200);
            arr3.add(300);
            //get
            System.out.println(arr3.get(1));
            //set
            System.out.println("before set: " + arr3);
           arr3.set(1, 400);
            System.out.println("after set: " + arr3);

            //toArray
            Object[] arr4 = arr3.toArray();
            for(Object o: arr4){
                System.out.println("element: " + o);
            

            // contains
             System.out.println("contains 100: " + arr3.contains(100));
            }

             arr3.add(79);
             System.out.println("print entire list: " + arr3);

             //sort the arraylist asending order
             arr3.sort(null);
             System.out.println("sorted list: " + arr3);

             // sort the arraylist descending order
             arr3.sort((a,b) -> b.compareTo(a));
             System.out.println("sorted list in descending order: " + arr3);

             // clone the arraylist
             List<Integer> arr5 = new ArrayList<>(arr3);
             System.out.println("cloned list: " + arr5);

             // ensure capacity
            // ((ArrayList<Integer>) arr5).ensureCapacity(20);
             
             ArrayList<Integer> arr6 = new ArrayList<>();
             arr6.ensureCapacity(100);

             // is empty
                System.out.println("is arr6 empty: " + arr6.isEmpty());

                // indexOf
                System.out.println("index of 79: " + arr3.indexOf(79)); 


                // in linkedlist or stack every thing is same ex-add ,remove ,size etc
      
LinkedList<Integer> aar7= new LinkedList<>();
aar7.add(1);
aar7.add(2);
aar7.add(3);
aar7.add(16);
System.out.println("linked list: " + aar7);
System.out.println(aar7.lastIndexOf(2));

//add first and last
aar7.addFirst(10);
System.out.println("linked list: " + aar7);
aar7.addLast(19);
System.out.println("linked list: " + aar7);

// remove first and last

aar7.removeFirst();
aar7.removeLast();
System.out.println("linked list: " + aar7);

// get first & last
System.out.println("linked list: " + aar7.getFirst());
System.out.println("linked list: " + aar7.getLast());

// peek -- return the first element(head)of the linked list
System.out.println("linked list: " + aar7.peek());

//poll-- return and remove the first element
System.out.println("before:"+ aar7);
System.out.println("linked list: " + aar7.poll());
System.out.println("after:"+ aar7);

//offer-- add specified element at the end && tell true if add 
System.out.println(aar7.offer(34));
System.out.println("linked list: " + aar7);


// stack implement

Stack<Integer> st= new Stack<>();
//push
st.push(20);
st.push(30);
st.push(40);
st.push(50);
System.out.println("stack: " + st);

// pop
st.pop();
System.out.println("stack: " + st);

//peek

System.out.println(st.peek());

//search 
System.out.println(st.search(30));

// empty

System.out.println(st.empty());

        }
    }
}









    