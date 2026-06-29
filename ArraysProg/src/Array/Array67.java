package com.akshay.Demo;

public class Array67 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        boolean flag = false;

        for (int i = ch.length-1; i > 0; i--) {
            if ( ch[i] >= 97 && ch[i] <= 122)

            {
                System.out.println(ch[i]);
                break;
            }
        }



    }
}
