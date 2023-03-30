import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int result = binomCoeff(n, k);
        System.out.println(result);
    }

    static int binomCoeff(int n, int k) {
        if(k == 0){
            return 1;
        }
        if(k == n){
            return 1;
        }
        return binomCoeff(n - 1, k - 1) + binomCoeff(n - 1, k);
    }

}