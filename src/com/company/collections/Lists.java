package com.company.collections;

import java.util.*;

public class Lists {

    //public interface List<E> extends Collection<E>

    public void Action(){
        List<String> list=new ArrayList<String>();

        List<String> list1=new LinkedList<String>();
    }

    public void ConvertArrayToList(){
        String[] array={"Java","Python","PHP","C++"};
        System.out.println("Printing Array: "+ Arrays.toString(array));
        //Converting Array to List
        List<String> list=new ArrayList<String>();
        for(String lang:array){
            list.add(lang);
        }
    }

    public void ConvertListToArray(){
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Mango");
        fruitList.add("Banana");
        fruitList.add("Apple");
        fruitList.add("Strawberry");

        String[] array = fruitList.toArray(new String[fruitList.size()]);
        System.out.println("Printing Array: "+Arrays.toString(array));
        System.out.println("Printing List: "+fruitList);

        //Sorting the list
        Collections.sort(fruitList);

        //Iterator implementation
        //list iterator is only for list
        ListIterator<String> li1 =  fruitList.listIterator();

        //forward
        while (li1.hasNext())
            System.out.print(li1.next() + " ");

        //Backward
        while (li1.hasPrevious())
            System.out.print(li1.previous() + " ");

    }




}
