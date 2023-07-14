# Assigment 1
# exercise 7
Reverse the order in array
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
// Input array's size
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
// Set the members of array
        int[] arr = setArray(size);
// Reverse the array
        reverseArray(arr, 0, arr.length - 1);
// Print the reversed array
        printArray(arr, arr.length);
    }

// setArray method used to set the members of array
    public static int[] setArray(int size){
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i ++){
            System.out.println("Enter array's member");
            int member = scanner.nextInt();
            arr[i] = member;
        }
        return arr;
    }

//reverseArray method used to reverse the order of members in array
    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }

// printArray method used to print out all the members of array
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. The user is prompted to enter the size of the array, and then the program calls the setArray method to initialize the array with user-defined values. Afterward, the program calls the reverseArray method to reverse the order of the array, and finally calls the printArray method to print out the reversed array.

setArray method: This method sets the members of the array. It takes the size of the array as input, creates an array of that size, and prompts the user to enter values for each member of the array using a loop. It returns the initialized array.

reverseArray method: This method recursively reverses the order of members in the array. It takes the array, the starting index, and the ending index as input. The method swaps the elements at the start and end positions, and then recursively calls itself with the next pair of indices until the start index is greater than or equal to the end index.

printArray method: This method prints out all the members of the array. It takes the array and the number of elements to print as input, and then iterates over the array, printing each element separated by a space.


1. INPUT: size - 4
          members - 4, 5, 6, 7
   OUTPUT: 7, 6, 5, 4

3. INPUT: size - 2
          members - 61 12
   OUTPUT: 12, 6
   
4. INPUT: size - 8
          members - 10, 41, 54, 22, 65, 74, 77, 85
   OUTPUT: 85, 77, 74, 65, 22, 54, 41, 10
