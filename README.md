# Assigment 1
# exercise 8
Check if the string consist only of digits
------------------------------------------------------
package com.company;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
// Input any string
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int n = string.length() - 1;
// Check the string
        check(string, n);
    }

    // check method is used to check if the input string consists of digits or not
    static void check(String string, int n) {
        if(n == 0){
            if(Character.isDigit(string.charAt(n))){
                System.out.println("YES");
                return;
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        if(Character.isDigit(string.charAt(n))){
            check(string, n - 1);
        }
        else{
            System.out.println("NO");
            return;
        }
    }
}
-----------------------------------------------------
The code is divided into the following components:

main method: It serves as the entry point of the program. The user is prompted to enter any string, and then the program calls the check method to check if the string consists only of digits.

check method: This method recursively checks if the characters in the string are digits or not. It takes the input string and the index of the character to check as input. If the index reaches 0, the method checks if the character at that position is a digit using Character.isDigit(). If it is, the method prints "YES" and returns. If it's not a digit, the method prints "NO" and returns. If the index is not 0, the method checks if the character at that position is a digit. If it is, the method calls itself recursively with the updated index (decremented by 1). If it's not a digit, the method prints "NO" and returns.


1. INPUT: 4541545
   OUTPUT: YES

3. INPUT: 54515f5151
   OUTPUT: NO
   
4. INPUT: 5532
   OUTPUT: YES
