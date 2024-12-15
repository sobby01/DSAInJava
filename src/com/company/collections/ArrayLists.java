package com.company.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayLists {

    public void Action(){
        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        Iterator itr = intList.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }

        for(Integer number:intList)
            System.out.println(number);

        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("Mango");
        stringList.add("Banana");
        stringList.add("Guava");

        for(String item : stringList){
            System.out.println(item);
        }

        System.out.println((stringList.get(1)));
        System.out.println((stringList.get(3)));

        //Sorting Arraylist
        Collections.sort(stringList);

       for(int i = 0; i < stringList.size(); i++){
           System.out.println(stringList.get(1));
       }

       stringList.forEach(x ->{
           System.out.println(x);
       });

        Iterator<String> itr1=stringList.iterator();
        itr1.forEachRemaining(a-> //Here, we are using lambda expression
        {
            System.out.println(a);
        });
    }


}
