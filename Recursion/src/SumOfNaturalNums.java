import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int result = sumOfNaturalNums(n);
        System.out.println(result);
    }

    private static int sumOfNaturalNums(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNaturalNums(n-1);
    }
}
