package EvenOdd;

import java.util.Scanner;

import static java.lang.Math.abs;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n;
        n = sc.nextInt();
        int sumE = 0, sumO = 0, x;
        int a[] = new int[n];
        System.out.println("Enter the number:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] % 2 == 0) {
                sumE = sumE + a[i];
            } else {
                sumO = sumO + a[i];
            }
        }
        System.out.println("Sum of the Even Numbers: " + sumE);
        System.out.println("Sum of the Odd Numbers: " + sumO);
        x = abs(sumE - sumO);
        System.out.println("Subtraction of Even & Odd: " + x);
    }
}
