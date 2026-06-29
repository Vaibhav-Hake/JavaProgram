package com.akshay.Demo;

public class Array12 {
    public  static void main(String[] args) {

        int[] arr = {1,3,4,3};
        int sum = 0;
        int cnt = 0;
        for (int i = 0; i< arr.length;i++)
        {
            if (arr[i]%2 != 0) {
                sum += arr[i];
                cnt++;
            }
        }

        System.out.println("AVG " + sum /cnt);

    }
}
