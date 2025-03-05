package Strings;

public class AppendOfAString {
    public static void main(String[] args) {
        String s1 = "Ayan";
        String s2 = "Khan";
        String result1 = s1 + " " + s2;
        System.out.println(result1);
        String result2 = s1.concat(" ").concat(s2);
        // String result2 = s1.concat(s2);
        System.out.println(result2);
        String s3 = new String("Faizan");
        String s4 = new String("Khan");
        String result3 = s3 + " " + s4;
        System.out.println(result3);
        String result4 = s3.concat(" ").concat(s4);
        System.out.println(result4);
    }
}
