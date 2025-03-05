package Strings;

public class AppendOfAStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Ayan Khan");
        sb1.append(" Core Java");
        System.out.println(sb1);
        sb1 = sb1.append(" Core Java");
        System.out.println(sb1);
    }
}
