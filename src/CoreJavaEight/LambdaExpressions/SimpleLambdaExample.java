package CoreJavaEight.LambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class SimpleLambdaExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ayan", "Samar", "Faizan");
        names.sort((a, b) -> a.compareTo(b));
        names.forEach(name -> System.out.println(name));
    }
}
