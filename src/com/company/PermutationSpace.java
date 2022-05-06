package com.company;

public class PermutationSpace {

    public void Permutations(String input, int index, String current){

        if(index == input.length()){
            System.out.println(current);
            return;
        }

        if(index == 0){

            String chars = input.substring(0,1);
            current = chars;
            index++;
        }

        String space = " ";
        String inputchars = input.substring(index,index+1);
        Permutations(input, index+1, current + space + inputchars);

        Permutations(input, index+1, current + inputchars);
    }
}
