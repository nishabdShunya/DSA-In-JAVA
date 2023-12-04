import java.util.Scanner;

public class BasicBacktrackingExamples {
    public static void main(String[] args) {
        System.out.print("Enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // Linearly print 1 to n using Backtracking
        System.out.print("Normal: ");
        print(n);
        // Line break
        System.out.println();
        // Linearly print n to 1 using Backtracking
        System.out.print("Reverse: ");
        printReverse(1, n);
    }

    private static void print(int n){
        if(n < 1){
            return;
        }
        print(n-1);
        System.out.print(n + " ");
    }

    private static void printReverse(int i, int n){
        if(i>n){
            return;
        }
        printReverse(i+1, n);
        System.out.print(i + " ");
    }
}
