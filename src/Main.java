public class Main {
    public static void main(String[] args) {

        int[] arr = {3, 2, 4, 1};
        int i = 0;
        double average = findAvg(arr, i, arr.length);
        System.out.println("Average number is " + average);
    }

    public static double findAvg(int[] arr, int i, int n){
        if(i == n - 1){
            return arr[i];
        }
        if(i == 0){
            i = i + 1;
            return ((arr[i - 1] + findAvg(arr, i, n))/n);
        }
        return (arr[i] + findAvg(arr, i + 1, n));
    }
}