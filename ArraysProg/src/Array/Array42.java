package com.akshay.Demo;

public class Array42 {
    public static void main() {


        char[] ch = {'a', 'e', 'i', 't'};
        for (int i = 0; i < ch.length; i++)
        {
            if (i%2 != 0)
            {
                System.out.println(ch[i]);
            }
        }

    }
}
