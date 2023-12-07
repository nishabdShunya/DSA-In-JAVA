import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = input.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter the " + (i+1) + " element: ");
            a[i] = input.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(a));
        reverseArray(a, 0, a.length);
        System.out.println("Reverse: " + Arrays.toString(a));
    }

    private static void reverseArray(int[] a, int i, int n){
        if(i == n/2){
            return;
        }
        swap(a, i, n-i-1);
        reverseArray(a, i+1, n);
    }

    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
