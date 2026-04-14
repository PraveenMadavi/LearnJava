package Java8.Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
//        List<Integer> randomNums = Arrays.asList(45, 1, 2, 32, 5, 6, 89, 7, 67, 2, 1, 32, 23);

//        Integer secondBig = randomNums.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(2)
//                .findFirst()
//                .get();
//
//        System.out.println(secondBig);

//        boolean allPositive = integers.stream().allMatch(n -> n > 0);
//        System.out.println("All Positive : " + allPositive);

        int sum = integers.stream().mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);


    }
}
