package com.company.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSets {

    /*
    Java LinkedHashSet class is a Hashtable and Linked list implementation of the Set interface.
    It inherits the HashSet class and implements the Set interface.
    The important points about the Java LinkedHashSet class are:
    Java LinkedHashSet class contains unique elements only like HashSet.
    Java LinkedHashSet class provides all optional set operations and permits null elements.
    Java LinkedHashSet class is non-synchronized.
    Java LinkedHashSet class maintains insertion order.
    public class LinkedHashSet<E> extends HashSet<E> implements Set<E>, Cloneable, Serializable
     */
    public void Action(){

        LinkedHashSet<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("one");
        linkedSet.add("twe");
        linkedSet.add("three");

        Iterator<String> it = linkedSet.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }

        for(String str : linkedSet){
            System.out.println(str);
        }

        

    }
}
