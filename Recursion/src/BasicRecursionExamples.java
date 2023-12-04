import java.util.Scanner;

public class BasicRecursionExamples {
    public static void main(String[] args) {
        System.out.print("Please enter the value of n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print(1, n);
    }

    public static void print(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        print(i+1, n);
    }
}