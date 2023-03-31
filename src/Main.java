import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int[] arr = {3, 2, 4, 1};
        double average = (findAvg(arr, arr.length - 1)) / arr.length;
        System.out.println("Average number is " + average);
    }
    public static double findAvg(int[] arr, int n){
        if(n == 0){
            return arr[0];
        }
        else {
            return arr[n] + findAvg(arr, n - 1);
        }
    }
}