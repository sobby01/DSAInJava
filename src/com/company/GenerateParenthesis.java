package com.company;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {

    public List<String> genParenthesis(int n) {
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
