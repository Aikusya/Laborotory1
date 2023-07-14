# Assigment 1
# exercise 2
Average number of the array
------------------------------------------------------
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
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. It prompts the user to enter the array size, calls the setArray method to initialize the array, and then calls the findAvgOfArr method to calculate the average of the array. The average is printed to the console.

findAvgOfArr method: This method recursively calculates the average number of the array. It takes the array and the number of elements to consider as input. If the size is 0, indicating an empty array, it returns 0. Otherwise, it recursively calls itself with a reduced size and multiplies the previously calculated average by (size - 1), adds the value of the current element, and divides the sum by the current size to get the updated average.

setArray method: This method sets the members of the array. It takes the size of the array as input, creates an array of that size, and prompts the user to enter values for each member of the array using a loop. It returns the initialized array.


1. INPUT: size - 5
          members - 4, 5, 6, 7, 8
   OUTPUT: Average is 6.0

2. INPUT: size - 4
          members - 8, 12, 95, 62
   OUTPUT: Average is 44.25
3. INPUT: size - 8
          members - 12, 41, 58, 41, 21, 12, 22, 36
   OUTPUT: Min number is 30.375
