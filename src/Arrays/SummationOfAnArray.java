package Arrays;

import java.util.Scanner;

public class SummationOfAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array: ");
        int n, sum = 0;
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.println("Enter the Element: " + (i + 1));
            arr[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
//        for(int value : arr) {
//            System.out.println("Summation of an Array: " + sum);
//        }
        System.out.println("Summation of an Array: " + sum);
    }
}
