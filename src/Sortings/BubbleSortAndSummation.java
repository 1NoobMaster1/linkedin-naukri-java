package Sortings;

import java.util.Scanner;

public class BubbleSortAndSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an Array");
        int n;
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the Element: " + (i + 1));
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < (n - 1); i++) {
            for (int j = 0; j < (n - 1); j++) {
                if (a[j + 1] < a[j]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int values : a) {
            System.out.println("Sorted Array by using Bubble Sort is: " + values);
        }
        System.out.println("Summation of smallest two numbers: ");
        System.out.println(a[0] + a[1]);
    }
}
