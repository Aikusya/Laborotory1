package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //User inputs any string
        System.out.println("Enter any string: ");
        String string = scanner.next();
        //We note the length of string for further calculations
        int length = string.length() - 1;
        //If the palindrome method returns true
        if(palindrome(string, 0, length )){
            System.out.println("String is palindrome");
        }
        //If the palindrome method returns false
        else {
            System.out.println("String is not palindrome");
        }

    }


    // palindrome method is used to check if the given string is palindrome or not
    public static boolean palindrome(String string, int start, int end){
        if(string.charAt(start) == string.charAt(end - start)) {
            if(start == end){
                return true;
            }
            palindrome(string, start + 1, end);
        }
        else {
            return false;
        }
        return true;
    }

}