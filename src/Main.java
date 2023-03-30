import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        isPrime(num);
    }

    public static void isPrime(int n){
        int count = 0;
        for(int i = 1; i <= n / 2; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 1){
            System.out.println("is prime");
        }
        else{
            System.out.println("is not prime");
        }
    }
}