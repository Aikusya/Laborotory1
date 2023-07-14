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