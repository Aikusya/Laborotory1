import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //0 1 1 2 3 5 8 13 ...
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = fibonacci(num);
        System.out.println(result);
    }

    public static int fibonacci(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}