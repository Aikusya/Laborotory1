package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // User inputs the size of array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
    // Method sets the members of array
        int[] arr = setArray(size);
    // Method finds the average number of array
        double average = findAvgOfArr(arr, size);
        System.out.println("Average is " + average);
    }

    // findAvgOfArr method finds the average number of array by recursion
    private static double findAvgOfArr(int[] arr, int size) {
        if (size == 0) {
            return 0;
        } else {
            double sum = findAvgOfArr(arr, size - 1) * (size - 1);
            sum += arr[size - 1];
            return sum / size;
        }
    }

    // setArray method sets the members of array
    public static int[] setArray(int size) {
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        // Loop is used to set the members of array
        for (int i = 0; i < size; i++) {
            System.out.println("Enter array's member");
            int member = scanner.nextInt();
            arr[i] = member;
        }
        return arr;
    }
}