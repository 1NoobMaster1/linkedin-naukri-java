package CoreJavaEight.MinimumMaximumNumber;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MinimumMaximumNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> minElement = numbers.stream().min(Integer::compareTo);
        minElement.ifPresent(min -> System.out.println("Minimum Number: " + min));
        Optional<Integer> maxElement = numbers.stream().max(Integer::compareTo);
        maxElement.ifPresent(max -> System.out.println("Maximum Number: " + max));
    }
}
