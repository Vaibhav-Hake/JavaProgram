package com.akshay.Demo;

public class Array52 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        int sum = 0;
        for (int i = 0; i < 3; i++)
        {
            if (ch[i] % 2 == 0)
            sum += ch[i];

        }

        System.out.println(sum);

    }
}
