package Reverse.WithoutMethod.Array;

import java.util.Arrays;

public class ReverseAnArrayWithoutMethod {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int reversedArray[] = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
