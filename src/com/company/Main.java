package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Usr inputs the number to calculate
        System.out.println("Enter the number: ");
        int number = scanner.nextInt();
        // Calculating the sum of digits of entered number
        System.out.println(calculateSum(number));
    }


    // calculateSum method is used to calculate the sum of digits if number
    public static int calculateSum(int number){
        // If number is in range 0 <= number <= 9 then it returns itself
        if(number / 10 == 0){
            return number;
        }
        // If the number > 9 then it calculates the sum of digits
        else {
            return number % 10 + calculateSum(number/10);
        }
    }

}