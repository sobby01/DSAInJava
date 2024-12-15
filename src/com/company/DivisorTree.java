package com.company;

public class DivisorTree {

    static int factorTree(int N)
    {
        int height = 0;
        while (N > 1)
        {
            boolean factorExist = false;
            for (int i = 2; i <= Math.sqrt(N); i++)
            {
                if (N % i == 0) {
                    N = N / i;
                    factorExist = true;
                    break;
                }
            }
            height++;
            if (!factorExist) {
                break;
            }
        }
        return height;
    }

}
