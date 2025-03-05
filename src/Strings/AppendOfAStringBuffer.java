package Strings;

public class AppendOfAStringBuffer {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("Ayan Khan");
        sb1.append(" Core Java");
        System.out.println(sb1);
        sb1.delete(0, sb1.length()); // Deletes the previous String.
        sb1 = sb1.append(" Core Java"); // It will give error while using final.
        System.out.println(sb1);
    }
}

// Here, StringBuffer is Mutable, Serialized & Thread Safe. But if we use final,
// then it will become an Immutable String just like new String & String.
