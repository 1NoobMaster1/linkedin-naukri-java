package Arrays;

import java.util.Scanner;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Elements: ");
        int n;
        n = sc.nextInt();
        int a[] = new int[n]; // Declaration & Instantiation.
        for(int i = 0; i < n; i++) { // Traversing.
            System.out.println("Enter the Element: " + (i + 1));
            a[i] = sc.nextInt(); // Initialisation.
        }
        for(int values : a) {
            System.out.println("Value is: " + values); // Printing the Values.
        }
    }
}
