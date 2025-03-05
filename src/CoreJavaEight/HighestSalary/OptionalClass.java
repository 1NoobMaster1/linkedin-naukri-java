package CoreJavaEight.HighestSalary;

import java.util.Arrays;
import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
        int arr[] = {7, 6, 5, 4, 3, 2, 1};
        Optional<Integer> num = Arrays.stream(arr)
                .distinct()
                .boxed()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();
        System.out.println(num.get());
    }
}
