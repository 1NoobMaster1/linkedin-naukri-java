package Bricks;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n;
        n = sc.nextInt();
        if(n <= 1) {
            System.out.println("Prime Number!");
        } else {
            int flag = 0;
            for(int i = 2; i < (n / 2); i++) {
                if(n % i == 0) {
                    System.out.println("Not a Prime Number!");
                    flag = 1;
                    break;
                }
            }
            if(flag == 0) {
                System.out.println("Prime Number!");
            }
        }
    }
}
