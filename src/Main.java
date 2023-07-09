import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// User inputs a size of an array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = scanner.nextInt();
        int[] arr = setArray(size);
        int min = findMin(arr, size);
        System.out.println("Min number is " + min);
    }

    // setArray method is used to initialize the members of an array
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

    // findMin method is used to find the min member of array
    public static int findMin(int[] arr, int size){
        if(size == 1){
            return arr[0];
        }
        else{
            int min = findMin(arr, size - 1);
            return Math.min(min, arr[size-1]);
        }
    }
}
