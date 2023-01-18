package com.bridgelabz.array_Program;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = new int[] { 2, 4, 1, 6, 7, 8, 9, 12 };

        System.out.println("Array Element:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("Array in reverse Element:");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
