package Strings;

import java.util.Scanner;

public class InputOfAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of an Array: ");
        int n;
        n = sc.nextInt();
        String arr[] = new String[n];
        sc.nextLine();
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the String: " + (i + 1));
            arr[i] = sc.nextLine();
        }
        for(String values : arr) {
            System.out.println("The value is: " + values);
        }
    }
}
