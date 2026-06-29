package com.akshay.Demo;

public class Array2 {
    public  static void main(String[] args) {

        int[] arr = {1,3,4,3};
        int sum = 0;
        for (int i = 0; i< arr.length;i++)
        {
            sum += arr[i];
        }

        System.out.println("Avg " +(double) sum / arr.length);

    }
}
