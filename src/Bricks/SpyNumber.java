package Bricks;

import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n;
        n = sc.nextInt();
        int b, product = 1, sum = 0;
        while(n > 0) {
            b = n % 10;
            product = b * product;
            sum = b + sum;
            n = n / 10;
        }
        if(product == sum) {
            System.out.println("Spy Number!");
        } else {
            System.out.println("!Spy Number");
        }
    }
}
