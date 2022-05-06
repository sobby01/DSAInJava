package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> generateParenthesis(int n) {

        List<String> coll = new ArrayList<String>();

        Generate(2, 2,2, coll, new StringBuilder()); //compile time

        return coll;
    }

    private void Generate(int n, int open, int close, List<String> coll, StringBuilder current){

        if(open == 0 && close == 0){
            coll.add(current.toString());
            return;
        }

        if(open != 0){
            current = current.append("(");
            Generate(n, open-1, close, coll, current);
            current.deleteCharAt(current.length() - 1);
        }
        if(close > open){
            current = current.append(")");
            Generate(n, open, close-1, coll, current);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
