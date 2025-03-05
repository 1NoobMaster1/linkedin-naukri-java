package Bricks;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String oS;
        oS = sc.nextLine();
        String rS = "";
        int length = oS.length();
        for(int i = length - 1; i >= 0; i--) {
            rS = rS + oS.charAt(i);
        }
        if(oS.equals(rS)) {
            System.out.println("Palindrome String!");
        } else {
            System.out.println("Not a Palindrome String!");
        }
        sc.close();
    }
}
