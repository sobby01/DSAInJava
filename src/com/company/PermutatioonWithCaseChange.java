package com.company;

import java.util.Locale;

public class PermutatioonWithCaseChange {

    public void Permutations(String input, int index, String current){

        if(index == input.length()){
            System.out.println(current);
            return;
        }

        String inputchars = input.substring(index,index+1);
        Permutations(input, index+1, current + inputchars.toLowerCase());

        Permutations(input, index+1, current + inputchars.toUpperCase());
    }

}
