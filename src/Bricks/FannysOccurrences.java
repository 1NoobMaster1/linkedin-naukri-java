package Bricks;

import java.util.Scanner;

public class FannysOccurrences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String input1;
        input1 = sc.nextLine();
        System.out.println("Enter a String to be removed: ");
        String input2;
        input2 = sc.nextLine();
         FannysOccurrences fo = new FannysOccurrences();
         System.out.println(fo.removeOccurrence(input1, input2));
    }
    public String removeOccurrence(String input1, String input2) {
        String s = "";
        char ch2 = input2.charAt(0);
        for(int i = 0; i < input1.length(); i++) {
            char ch1 = input1.charAt(i);
            if(ch1 != ch2) {
                s = s + ch1;
            }
        }
        return s;
    }
}
