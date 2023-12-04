import java.util.Scanner;

public class BasicRecursionExamples {
    public static void main(String[] args) {
        System.out.print("Please enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // Linearly print 1 to n using Recursion
        System.out.print("Normal: ");
        print(1, n);
        // Line break
        System.out.println();
        // Linearly print n to 1 using Recursion
        System.out.print("Reverse: ");
        printReverse(n);
    }
    private static void print(int i, int n){
        if(i > n){
            return;
        }
        System.out.print(i + " ");
        print(i+1, n);
    }
    private static void printReverse(int n) {
        if(n < 1){
            return;
        }
        System.out.print(n + " ");
        printReverse(n-1);
    }
}