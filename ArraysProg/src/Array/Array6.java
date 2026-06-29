package com.akshay.Demo;

public class Array6 {
    public  static void main(String[] args) {

        int[] arr = {1,3,4,3};
        int sum = 0;
        for (int i = arr.length-3; i< arr.length;i++)
        {
            sum += arr[i];
        }

        System.out.println(sum);

    }
}
