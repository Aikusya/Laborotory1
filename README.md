# Assigment 1
# exercise 9
Calculate the binomial coefficient
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // User inputs two numbers
        System.out.println("Enter two numbers:");
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = binomialCoefficient(n, k);
        System.out.println("The binomial coefficient of " + n + " and " + k + " is " + result);
    }

    
     //binomialCoefficient calculates the binomial coefficient of two numbers using recursion.
    static int binomialCoefficient(int n, int k) {
        if (k < 0 || k > n) {
            return 0;
        }
        if (k == 0 || k == n) {
            return 1;
        }
        return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. The user is prompted to enter two numbers, and then the program calls the binomialCoefficient method to calculate the binomial coefficient of the two numbers. The result is printed to the console.

binomialCoefficient method: This method recursively calculates the binomial coefficient of two numbers. It takes the first number n and the second number k as input. The method first checks if the value of k is outside the valid range (less than 0 or greater than n). If so, it returns 0 since the binomial coefficient is not valid. Next, it checks if k is 0 or equal to n, which are the base cases where the binomial coefficient is 1. If neither of the base cases is met, the method recursively calls itself with the parameters n - 1 and k - 1, and n - 1 and k, and adds the results together.


1. INPUT: 10, 5
   OUTPUT: 252

3. INPUT: 5, 4
   OUTPUT: 5
   
4. INPUT: 9, 3
   OUTPUT: 84
