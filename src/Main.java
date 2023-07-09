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

