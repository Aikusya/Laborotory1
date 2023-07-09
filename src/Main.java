import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
// Input the number user wants to power
        System.out.println("Enter the number u want to power: ");
        int num = scanner.nextInt();
// Input the number user wants to power the previous number
        System.out.println("Enter the number u want to powered bby: ");
        int power = scanner.nextInt();
// Calculate the result
        int result = power(num, power);
        System.out.println(result);
    }

// power method calculates the power of numbers
    public static int power(int a, int n){
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return a;
        }
        return a * power(a, n - 1);
    }
}

