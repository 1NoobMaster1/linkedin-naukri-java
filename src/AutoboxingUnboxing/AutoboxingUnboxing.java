package AutoboxingUnboxing;

public class AutoboxingUnboxing {
    public static void main(String[] args) {
        /* int num = 10;
        Integer obj = num; // Autoboxing.
        System.out.println(obj); */

        Integer obj = new Integer(20);
        int num = obj; // Unboxing.
        System.out.println(num);
    }
}
