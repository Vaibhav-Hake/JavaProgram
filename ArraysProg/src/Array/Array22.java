package com.akshay.Demo;

public class Array22 {
    public  static void main(String[] args) {

        int[] arr = {1,7,4,3};
        int prod = 1;

        for (int i = 0; i< arr.length;i++)
        {
            if (arr[i] % 7 == 0 || arr[i] % 10 == 7)
                System.out.println(arr[i]);

        }



    }
}
