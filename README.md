# Assigment 1
# exercise 3
Check if a number is prime or not
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// User inputs the number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
// Checking if the number is prime or not
        if (number == 1 || number == 0) {
            System.out.println(number + " is not a prime neither prime number.");
        } else {
            if (isPrime(number, number / 2)) {
                System.out.println(number + " is a prime number.");
            }
            else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }

// isPrime method checks if the number is prime or not using recursion
    private static boolean isPrime(int number, int divisor) {
        if (divisor == 1) {
            return true;
        }
        if (number % divisor == 0) {
            return false;
        }
        return isPrime(number, divisor - 1);
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. The user is prompted to enter a number, and then the program checks if the number is 0 or 1 (which are neither prime nor composite). If the number is not 0 or 1, the program calls the isPrime method to check if the number is prime or not. The result is printed to the console.

isPrime method: This method recursively checks if a number is prime or not. It takes the number to check and the current divisor as input. If the divisor reaches 1, the method returns true, indicating that the number is prime. If the number is divisible by the current divisor, the method returns false, indicating that the number is not prime. Otherwise, the method calls itself recursively with a reduced divisor to continue checking. The result is calculated using the logical AND operation (&&) with the recursive call, ensuring that all divisors are checked until the base case is reached.


1. INPUT: 8
   OUTPUT: 8 is not a pirme number

2. INPUT: 1
   OUTPUT: 1 is not a prime neither prime number.
3. INPUT: 11
   OUTPUT: 11 is a prime number.
