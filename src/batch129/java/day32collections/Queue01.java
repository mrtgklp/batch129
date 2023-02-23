package batch129.java.day32collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
    /*
        1) "Queue" larda ilk gelen ilk isleme girer.(First In Fırst Out ==> FIFO)
        2) BAzen de son gelen ilk isleme girer.(Last In Fırst Out ==> LIFO)
        3) "Deque" "Double Ended Queue" hem "FIFO" hem de "LIFO" için kullanılır.

        "Queue" bir Interface'dir . Bu yuzden "constructor"i yoktur. Dolasıyla object olustururken "new" keyword'undan sonra kullanılamaz
        Data type'i "Queue" olan bir object olusturmak için "new" keyword'unden sonra i)LinkedList veya ii) PriorityQueue

        "Queue" olustururken constructor olarak "PriorityQueue" kullanırsanız,elemanları kendi belirleyeceginiz kuraala
        göre sıralama hakkınız olur.
     */
    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");
        System.out.println("myQueue = " + myQueue);//myQueue = [Milk, Butter, Jam, Egg, Luxury water]

        //Retrieves and removes the head of this queue, or returns null if this queue is empty.
        myQueue.poll();
        //Retrieves and removes the head of this queue. This method differs from poll() only in that it throws an exception if this queue is empty.
        //Returns:
        //the head of this queue
        //Throws:
        //NoSuchElementException – if this queue is empty
        myQueue.remove();


        //Retrieves, but does not remove, the head of this queue.
        // This method differs from peek only in that it throws an exception if this queue is empty.
        //Throws:
        //NoSuchElementException – if this queue is empty
        myQueue.element();

        //Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
        myQueue.peek();

        /*
            poll() ile remove() ikisi de ilk elemanı siler ve size verir
            poll() bos "Queue" lar için "null" verir,remove() ise "Queue"lar için exception arar
         */

        /*
            element() ile peek() ikisi de ilk elemanı silmeden ve size verir
            peek() bos "Queue" lar için "null" verir,element() ise bos "Queue"lar için exception atar
         */

        /*
        Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
        When using a capacity-restricted queue, this method is generally preferable to add, 
        which can fail to insert an element only by throwing an exception.

       Returns:
              true if the element was added to this queue, else false
       Throws:
              ClassCastException – if the class of the specified element prevents it from being added to this queue
              NullPointerException – if the specified element is null and this queue does not permit null elements
              IllegalArgumentException – if some property of this element prevents it from being added to this queue


         */
       boolean r = myQueue.offer("Avocada");
        System.out.println("r = " + r);//r = true

        System.out.println("myQueue = " + myQueue);//myQueue = [Jam, Egg, Luxury water, Avocada]

        Queue<String> yourQueue = new PriorityQueue<>();
        yourQueue.add("Milk");
        yourQueue.add("Butter");
        yourQueue.add("Jam");
        yourQueue.add("Egg");
        yourQueue.add("Luxury water");
        System.out.println("yourQueue = " + yourQueue);//yourQueue = [Butter, Egg, Jam, Milk, Luxury water]

    }
}
