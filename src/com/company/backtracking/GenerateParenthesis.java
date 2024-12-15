package com.company.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> collection = new ArrayList();
        GenerateAll(new char[2 * n], 0, collection);
        return collection;
    }

    private void GenerateAll(char[] current, int position, List<String> result){
        if(position == current.length){
            if(IsValid(current)){
                result.add(new String(current));
            }
        }
        else{
            current[position] = '(';
            GenerateAll(current, position + 1, result);
            current[position] = ')';
            GenerateAll(current, position + 1, result);
        }
    }

    private boolean IsValid(char[] current){
        int balance = 0;
        for(int c : current){
            if(c == '(') balance++;
            else balance--;

            if(balance < 0)
                return false;
        }

        return (balance == 0);
    }
}
