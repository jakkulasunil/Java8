package com.prg.java8;

public class Program_7 {
    public static void reverseArray(int[] arr, int first, int last) {

        while (first < last) {
          int i = arr[first];
            arr[first] = arr[last];
            arr[last] = i;
            first++;
            last--;
        }
    }

    public static void printArray(int[] arr) {
        for (int ar : arr) {
            System.out.print(" "+ar);
        }
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        reverseArray(arr,0,arr.length-1);
        printArray(arr);

    }
}
