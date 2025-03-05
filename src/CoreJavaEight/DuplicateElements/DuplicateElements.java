package CoreJavaEight.DuplicateElements;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        // int arr[] = {1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 4, 3, 2, 1);
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n)) // If add() returns false, it's duplicate.
                .collect(Collectors.toSet());
        System.out.println("Duplicate Elements: " +duplicates);
    }
}
