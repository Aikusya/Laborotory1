# Assigment 1
# exercise 10
Calculate GCD
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = gcd(a, b);
        System.out.println("The GCD of " + a + " and " + b + " is " + result);
    }


     //Calculates the Greatest Common Divisor (GCD) of two numbers using the Euclidean algorithm.
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. The user is prompted to enter two numbers, and then the program calls the gcd method to calculate their GCD. The result is printed to the console.

gcd method: This method calculates the GCD of two numbers using the Euclidean algorithm. It takes the first number a and the second number b as input. The method checks if b is 0, which indicates that a is the GCD. In that case, it returns a. If b is not 0, the method calculates the remainder of a divided by b using the modulo operator (%). Then, it recursively calls itself with the arguments b and a % b, continuing the process until b becomes 0 and the GCD is found.


1. INPUT: 4, 5
   OUTPUT: 1

3. INPUT: 10, 30
   OUTPUT: 10
   
4. INPUT: 50, 35
   OUTPUT: 5
