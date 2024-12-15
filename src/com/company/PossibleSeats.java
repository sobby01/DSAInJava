package com.company;

public class PossibleSeats {

    public boolean Solve(int n, int m, int[] seats){
        // code here
        int[] possibleSeats = new int[seats.length];
        for(int i =0; i < seats.length; i++){
            if(seats[i] == 1){
                possibleSeats[i] = 0;
                if(i-1 >= 0)
                    possibleSeats[i-1] = 0;
                if(i+1 < seats.length){
                    possibleSeats[i+1] = 0;
                    ++i;
                }
            }
            else{
                if(i-1 >= 0 && possibleSeats[i-1] != 1)
                    possibleSeats[i] = 1;
                else
                    possibleSeats[i] = 0;
            }
        }
        int count = 0;
        for(int i =0; i < possibleSeats.length; i++){
            if(possibleSeats[i] == 1){
                count++;
            }
        }

        if(count == n)
            return true;
        else
            return false;
    }
}
