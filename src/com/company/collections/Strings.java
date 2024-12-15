package com.company.collections;

public class Strings {

    public void Solve(){
        char[] arrSample = {'R', 'O', 'S', 'E'};
        String strSample_1 = new String (arrSample);
        String strSample_2 = "ROSE";
    }

    private void Concat(String str1, String str2){
        String str3 = str1.concat(str2);
        System.out.println(str3);

        String str4 = str1 + str2;
        System.out.println(str4);

        System.out.println("Length of String: " + str4.length());
    }

    private void GetChar(){
        String str_Sample = "RockStar";
        System.out.println("Character at position 5: " + str_Sample.charAt(5));
        System.out.println("Index of character 'S': " + str_Sample.indexOf('S'));
    }

}
