import java.util.Scanner;

public class SumOfNaturalNums {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        sumOfNaturalNums(0, n);
    }

    private static void sumOfNaturalNums(int sum, int n) {
        if (n < 1) {
            System.out.println(sum);
            return;
        }
        sumOfNaturalNums(sum + n, n - 1);
    }
}
