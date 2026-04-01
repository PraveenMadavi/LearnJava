package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amrita", "Sanskar", "Pratham", "Rambha", "Nachin", "Jay");

         Map<String,Integer> myMap =list.stream().collect(Collectors.toMap(s -> s,String::length));

        System.out.println(myMap);

        Map<String, List<Integer>> listMap = list.stream().collect(Collectors.groupingBy(s -> s, Collectors.mapping(String::length, Collectors.toList())));
        System.out.println(listMap);

        Map<Character, List<String>> characterListMap = list.stream().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(characterListMap);
    }
}
