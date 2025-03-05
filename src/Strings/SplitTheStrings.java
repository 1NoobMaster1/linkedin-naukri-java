package Strings;

public class SplitTheStrings {
    public static void main(String[] args) {
        String str = "Ayan Khan";
        String replaceStr = str.replace(" ", ", ");
        String splitStr[] = replaceStr.split(" ");
        for(String value : splitStr) {
            System.out.println(value);
        }
    }
}
