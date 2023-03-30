import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int[] arr = {1, 4, 2, 6};
        reverseArray(arr, 0, arr.length - 1);
        printArray(arr, arr.length);
    }

    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }

    static void printArray(int[] arr, int size) {
        for (int i=0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}