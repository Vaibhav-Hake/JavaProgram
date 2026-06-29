package com.akshay.Demo;

public class Array57 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        int sum = 1;
        for (int i = 0; i < ch.length; i++)
        {
            if (ch[i] % 2 != 0)
                sum *= ch[i];

        }

        System.out.println(sum);

    }
}
