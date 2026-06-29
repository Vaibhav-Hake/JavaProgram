package com.akshay.Demo;

public class Array38 {

    public static void main() {


        char [] ch = {'a', 'e', 'd', 'f', 'i'};

        for(int i = 0; i< ch.length ;i++){
            if (!(ch[i] >= 97 && ch[i] <= 122) || !(ch[i] >= 65 && ch[i] <= 90 || !(ch[i] >= 48 &&  ch[i] <= 57)))
                System.out.println(ch[i]);
        }

    }

}
