package com.company.collections;

import java.util.Iterator;
import java.util.LinkedList;

///Java LinkedList class uses a doubly linked list to store the elements.
// It provides a linked-list data structure.
// It inherits the AbstractList class and implements List and Deque interfaces.
//Java LinkedList class can contain duplicate elements.
//Java LinkedList class maintains insertion order.
//Java LinkedList class is non synchronized.
// In Java LinkedList class, manipulation is fast because no shifting needs to occur.
//Java LinkedList class can be used as a list, stack or queue.
public class LinkedLists {

    //public class LinkedList<E> extends AbstractSequentialList<E> implements List<E>, Deque<E>, Cloneable, Serializable
    public void Action(){
        LinkedList<String> ll = new LinkedList<>();
        ll.add("Saurabh");
        ll.add("Amit");
        ll.add("Ankur");
        ll.add("Ajay");

        Iterator<String> it1 = ll.iterator();

        while(it1.hasNext()){
            System.out.println(it1.next());
        }

        ll.addFirst("ss1");
        ll.addLast("ss3");

        ll.remove("ss3");

        Iterator i=ll.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        for(String item : ll){
            System.out.println(i.next());
        }

        ll.peek();
        ll.peekLast();
        ll.poll();
        ll.pollLast();


    }

}
