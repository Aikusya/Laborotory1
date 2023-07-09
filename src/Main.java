import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
// Input array's size
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
// Set the members of array
        int[] arr = setArray(size);
// Reverse the array
        reverseArray(arr, 0, arr.length - 1);
// Print the reversed array
        printArray(arr, arr.length);
    }

// setArray method used to set the members of array
    public static int[] setArray(int size){
        int[] arr = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < size; i ++){
            System.out.println("Enter array's member");
            int member = scanner.nextInt();
            arr[i] = member;
        }
        return arr;
    }

//reverseArray method used to reverse the order of members in array
    static void reverseArray(int[] arr, int start, int end) {
        int temp;
        if (start >= end)
            return;
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArray(arr, start+1, end-1);
    }

// printArray method used to print out all the members of array
    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}