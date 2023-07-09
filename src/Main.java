import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

// User inputs the number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();
        int result = factorial(num);
        System.out.println(result);
    }

// factorial methods calculates the factorial of the input number
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}

