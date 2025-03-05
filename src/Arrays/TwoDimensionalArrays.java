package Arrays;

import java.util.Scanner;

public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of ROWS: ");
        int n1;
        n1 = sc.nextInt();
        System.out.println("Enter the number of COLUMNS: ");
        int n2;
        n2 = sc.nextInt();
        int a[][] = new int[n1][n2];
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n1; i++) {
            for(int j = 0; j < n2; j++) {
                System.out.println("Printing the Elements of an Array: " + a[i][j]);
            }
        }
    }

}
