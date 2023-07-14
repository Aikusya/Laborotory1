# Assigment 1
# exercise 6
Power of numbers
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// Input the number user wants to power
        System.out.println("Enter the number u want to power: ");
        int num = scanner.nextInt();
// Input the number user wants to power the previous number
        System.out.println("Enter the number u want to powered bby: ");
        int power = scanner.nextInt();
// Calculate the result
        int result = power(num, power);
        System.out.println(result);
    }

    // power method calculates the power of numbers
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return a;
        }
        return a * power(a, n - 1);
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. The user is prompted to enter the base number and the exponent (power), and then the program calls the power method to calculate the result by raising the base number to the power. The result is printed to the console.

power method: This method recursively calculates the power of a number. It takes the base number a and the exponent n as input and checks if n is 0 or 1. If n is 0, the method returns 1 as the base case. If n is 1, the method returns a as the base case. Otherwise, it calls itself recursively with the parameters a and n - 1 to calculate the power of the base number and multiplies it with a to get the result.


1. INPUT: number - 4
          power - 5
   OUTPUT: 1024

3. INPUT: number - 2
          power - 6
   OUTPUT: 64
   
4. INPUT: number - 8
          power - 10
   OUTPUT: 1073741824
