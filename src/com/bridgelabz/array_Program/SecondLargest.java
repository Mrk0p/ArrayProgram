package com.bridgelabz.array_Program;

import java.util.Scanner;
import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {

    System.out.println("Enter numbee to find second largest number");
    Scanner scanner = new Scanner(System.in);

    int num = scanner.nextInt();
    int a[] = new int[num];


		for (int i = 0; i < num; i++)
    a[i] = scanner.nextInt();

		Arrays.sort(a);
		System.out.print("The Second Largest Number: " + a[num - 2]);
    }
}
 
