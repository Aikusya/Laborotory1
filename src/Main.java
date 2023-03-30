import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int power = scanner.nextInt();
        int result = power(num, power);
        System.out.println(result);
    }

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