package Reverse.WithoutMethod.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseOfAnArrayListWithMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Original List: " + al);
        Collections.reverse(al);
        System.out.println("Reversed List: " + al);
    }
}
