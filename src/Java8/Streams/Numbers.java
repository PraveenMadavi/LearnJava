package Java8.Streams;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class Numbers {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> randomNumbs = Arrays.asList(45, 1, 2, 32, 5, 6, 89, 7, 67, 2, 1, 32, 23, 5);

//        Integer secondBig = randomNumbs.stream()
//                .distinct()
//                .sorted(Comparator.reverseOrder())
//                .skip(2)
//                .findFirst()
//                .get();
//        System.out.println(secondBig);

//        boolean allPositive = integers.stream().allMatch(n -> n > 0);
//        System.out.println("All Positive : " + allPositive);

        //STREAM - SUM
//        int sum = integers.stream()
//                .mapToInt(Integer::intValue)
//                .sum(); //.average() for Avg
//        System.out.println(sum);

//        Collections.reverse(integers); // FOR REVERSE THE LIST OF INTEGERS
//        int skippedSum = integers.stream()
//                .mapToInt(Integer::intValue)
//                .skip(4)
//                .sum();
//        System.out.println(skippedSum);

        //FIND DUPLICATES
        Set<Integer> numbs = new HashSet<>();
        List<Integer> duplicates = randomNumbs.stream()
                .filter(n -> !numbs.add(n))
                .toList();
        System.out.println("duplicates = " + duplicates);

    }
}
