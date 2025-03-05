package Reverse.WithoutMethod.ArrayList;

import java.util.ArrayList;

public class ReverseOfAnArrayListWithoutMethod {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        System.out.println("Original List: " + al);
        System.out.println(al.get(0));
        System.out.println(al.size());
        for(int i = 0, j = al.size() - 1; i < j; i++, j--) {
            int temp =al.get(i);
            al.set(i, al.get(j));
            al.set(j, temp);
        }
        System.out.println("Reverse List: " + al);
    }
}
