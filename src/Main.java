import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        double average = findAvgOfArr(arr, n);
        System.out.println("Average is " + average);
    }

    public static double findAvgOfArr(int[] arr, int n){
        if(n == 0){
            return 0;
        }
        else {
            double sum = findAvgOfArr(arr, n - 1)*(n - 1);
            sum += arr[n - 1];
            return sum/n;
        }

    }
}