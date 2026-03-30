package Java8.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amrita", "Sanskar", "Pratham", "Sambhav", "Sachin", "Sai");

         Map<String,Integer> myMap =list.stream().collect(Collectors.toMap(s -> s,String::length));

        System.out.println(myMap);
    }
}
