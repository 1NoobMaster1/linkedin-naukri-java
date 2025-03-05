package Bricks;

import java.util.Scanner;

public class  PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n;
        n = sc.nextInt();
        int oN = n, rN = 0;
        int r;
        while(n != 0) {
            r = n % 10;
            rN = r + rN * 10;
            n = n / 10;
        }
        if(oN == rN) {
            System.out.println("Palindrome Number!");
        } else {
            System.out.println("Not a Palindrome Number!");
        }
    }
}
