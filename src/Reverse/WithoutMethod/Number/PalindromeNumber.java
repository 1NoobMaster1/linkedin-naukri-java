package Reverse.WithoutMethod.Number;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n;
        n = sc.nextInt();
        int oN = n, r, rN = 0;
        while(n != 0) {
            r = n % 10;
            rN = r + rN * 10;
            n = n / 10;
        }
        System.out.println("Reversed Number: " + rN);
    }
}
