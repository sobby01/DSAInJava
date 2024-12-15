package com.company.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSets {

    /*Java HashSet class is used to create a collection that uses a hash table for storage.
    It inherits the AbstractSet class and implements Set interface.
    HashSet stores the elements by using a mechanism called hashing.
    HashSet contains unique elements only.
    HashSet allows null value.
    HashSet class is non synchronized.
    HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
    HashSet is the best approach for search operations.
    The initial default capacity of HashSet is 16, and the load factor is 0.75. */
    //A list can contain duplicate elements whereas Set contains unique elements only.
    public void Action(){
        HashSet<String> set = new HashSet<>();
        set.add("One");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");

        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        HashSet<String> duplicateSet =new HashSet<String>();
        duplicateSet.add("Saurabh");
        duplicateSet.add("Vijay");
        duplicateSet.add("Saurabh");
        duplicateSet.add("Ajay");

        //this will handle the duplicates
        Iterator<String> duplicateIterator = duplicateSet.iterator();
        while(duplicateIterator.hasNext()){
            System.out.println(duplicateIterator.next());
        }
    }
}
