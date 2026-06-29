package com.akshay.Demo;

public class Array58 {
    public static void main() {


        char[] ch = {'a', 'e', 'r', 'f'};
        boolean flag = false;
        int sum = 1;
        for (int i = 0; i < ch.length; i++) {
            switch (ch[i]) {
                case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> flag = true;
            }

            if (flag)
            {
                System.out.println(ch[i]);
            }

        }

        System.out.println(sum);

    }
}
