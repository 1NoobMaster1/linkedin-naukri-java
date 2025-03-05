package CoreJavaEight.HighestSalary;

import java.util.Arrays;

public class FirstHighestSalary {
    public static void main(String[] args) {
        int arr[] = {7, 6, 5, 4, 3, 2, 1};
        int num = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(0)
                .findFirst()
                .orElseThrow();
        System.out.println(num);
    }
}
