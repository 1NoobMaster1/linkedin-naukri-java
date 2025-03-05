package Collections;

import java.util.ArrayList;

public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println("Fruits: " + fruits);

        String firstFruit = fruits.get(0);
        System.out.println("First Fruit: " + firstFruit);

        fruits.remove("Banana");
        System.out.println("Removing: " + fruits);

        for(String fruit : fruits) {
            System.out.println("Iteration: " + fruit);
        }

        int size = fruits.size();
        System.out.println("Size of an ArrayList: " + size);
    }
}
