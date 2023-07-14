# Assigment 1
# exercise 5
Fibonacci
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 ...
        Scanner scanner = new Scanner(System.in);
// Input the number
        int num = scanner.nextInt();
// Finding the Fibonacci
        int result = fibonacci(num);
        System.out.println(result);
    }

    // fibonacci methods calculates the number in fibonacci row
    public static int fibonacci(int num){
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return 1;
        }
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. The user is prompted to enter a number, and then the program calls the fibonacci method to calculate the number at the given position in the Fibonacci sequence. The result is printed to the console.

fibonacci method: This method recursively calculates the number at the given position in the Fibonacci sequence. It takes the position num as input and checks if num is 0 or 1. If it is, the method returns the respective base cases (0 for position 0 and 1 for position 1). Otherwise, it calls itself recursively with the parameters num - 1 and num - 2 to calculate the numbers at the previous two positions in the Fibonacci sequence and adds them together to get the number at the current position.


1. INPUT: 5
   OUTPUT: 5

2. INPUT: 8
   OUTPUT: 21
   
4. INPUT: 6
   OUTPUT: 8
