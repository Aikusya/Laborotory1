# Assigment 1
# exercise 
Factorial
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// User inputs the number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

    // factorial methods calculates the factorial of the input number
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. The user is prompted to enter a number, and then the program calls the factorial method to calculate the factorial of the input number. The result is printed to the console.

factorial method: This method recursively calculates the factorial of the input number. It takes the number n as input and checks if n is equal to 1. If it is, the method returns 1 as the base case. Otherwise, it calls itself recursively with the parameter n - 1 and multiplies the result by n. The multiplication continues until the base case is reached, resulting in the factorial of the input number.


1. INPUT: 5
   OUTPUT: 120

2. INPUT: 4
   OUTPUT: 24
3. INPUT: 10
   OUTPUT: 3628800
