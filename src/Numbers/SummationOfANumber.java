package Numbers;

import java.util.Scanner;

public class SummationOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n;
        n = sc.nextInt();
        int b, sum = 0;
        while(n > 0) {
            b = n % 10;
            sum = b + sum;
            n = n / 10;
        }
        System.out.println("Summation of a given Number: " + sum);
    }
}
