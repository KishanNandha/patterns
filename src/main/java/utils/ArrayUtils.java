package utils;

import java.util.Arrays;

public class ArrayUtils {
    public static void main(String[] args) {
        String s = "kishan";
        s.toLowerCase();
        System.out.println(s.charAt(0));
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0 ; i< arr.length ; i++) {
            if(i != arr.length -1 ) {
                System.out.print(arr[i]+", ");
            }
            else {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print("]");
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {

        }
        return arr;
    }
}
