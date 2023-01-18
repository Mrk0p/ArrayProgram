package com.bridgelabz.array_Program;

public class AscendingOrder {

    public static void main(String[] args) {

        int[] array = new int[] { 7, 1, 9, 6, 2, 3, 7, 5, 8 };
        int temp = 0;

        System.out.println("Element of original array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("");

        System.out.println("Elements of array sorted in ascending order: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
