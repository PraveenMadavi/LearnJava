package Java8.Streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class FlatMap {
    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4, 5, 6),
                Arrays.asList(1, 3),
                Arrays.asList(7, 8, 9)
        );

        List<Integer> flatted = list.stream().flatMap(Collection::stream).toList();

        System.out.println(flatted);
    }
}

