# Assigment 1
# exercise 1
Minimum number of the array
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // User inputs a size of an array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
    //Does set the size of array
        int[] arr = setArray(size);
    //Does find the min member of array
        int min = findMin(arr, size);
        System.out.println("Min number is " + min);
    }

    // setArray method is used to initialize the members of an array
    public static int[] setArray(int size){
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
    // Loop is used to initialize members of array
        for(int i = 0; i < size; i ++){
            System.out.println("Enter array's member");
            int member = scanner.nextInt();
            arr[i] = member;
        }
        return arr;
    }

    // findMin method is used to find the min member of array by recursion
    public static int findMin(int[] arr, int size){
        if(size == 1){
            return arr[0];
        }
        else{
            int min = findMin(arr, size - 1);
            return Math.min(min, arr[size-1]);
        }
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. It prompts the user to enter the array size, calls the setArray method to initialize the array, and then calls the findMin method to determine the minimum number in the array. The minimum number is printed to the console.

setArray method: This method initializes the members of the array. It takes the size of the array as input, creates an array of that size, and prompts the user to enter values for each member of the array using a loop. It returns the initialized array.

findMin method: This method recursively finds the minimum member in the array. It takes the array and the number of elements to consider as input. If there is only one element, it returns that element. Otherwise, it recursively calls itself with a reduced size and compares the minimum found so far with the last element of the array using Math.min. The minimum value is returned.


1. INPUT: size - 4
          members - 5, 7, 8, 15
   OUTPUT: Min numbers is 5

2. INPUT: size - 6
          members - 8, 6, 7, 5, 9, 10
   OUTPUT: Min number is 5
3. INPUT: size - 10
          members - 74, 54, 96, 25, 22, 8, 35, 44, 12, 66
   OUTPUT: Min number is 8
