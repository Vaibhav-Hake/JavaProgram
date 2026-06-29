package com.akshay.Demo;

public class Array68 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        boolean flag = false;

        for (int i = ch.length-1; i > 0; i--) {
            if ( ch[i] >= 48 && ch[i] <= 57)

            {
                System.out.println(ch[i]);
                break;
            }
        }



    }
}
