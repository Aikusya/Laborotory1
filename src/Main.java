import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
// Input two numbers
        int a = scanner.nextInt();
        int b = scanner.nextInt();
// Find their GCD
        int result = gcd(a, b);
        System.out.println(result);
    }

// gcd method calculates the Great Common Divisor of two numbers
    public static int gcd(int a, int b)
    {
        if (a == 0)
            return b;

        return gcd(b % a, a);
    }
}