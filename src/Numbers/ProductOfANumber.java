package Numbers;

import java.util.Scanner;

public class ProductOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n;
        n = sc.nextInt();
        int b, product = 1;
        while(n > 0) {
            b = n % 10;
            product = b * product;
            n = n / 10;
        }
        System.out.println("Product of a given Number: " + product);
    }
}
