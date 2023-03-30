import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        int n = string.length() - 1;
        check(string, n);
    }

    static void check(String string, int n) {
        if(n == 0){
            if(Character.isDigit(string.charAt(n))){
                System.out.println("YES");
                return;
            }
            else{
                System.out.println("NO");
                return;
            }
        }
        if(Character.isDigit(string.charAt(n))){
            check(string, n - 1);
        }
        else{
            System.out.println("NO");
            return;
        }
    }

}