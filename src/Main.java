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

