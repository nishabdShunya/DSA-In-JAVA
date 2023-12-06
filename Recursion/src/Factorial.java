import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int ans = factorial(n);
        System.out.println(ans);
    }

    private static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n * factorial(n-1);
    }
}
