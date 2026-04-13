package Java8.Streams;

import BinaryTree.BST;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Grouping {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Amrita", "Aman", "Ashok", "Birju", "Bilawal", "Sanskar", "Pratham", "Praveen", "Rambha", "Sachin", "Jay" ,"Juli", "Veer", "Viru", "Nachiket", "Aman", "Praveen", "Jay", "Veer", "Rambha", "Jay");

//         Map<String,Integer> myMap =list.stream().collect(Collectors.toMap(s -> s,String::length));
//        System.out.println(myMap);

        Map<Integer, List<String>> lengthOfNames = list.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(lengthOfNames);

        Map<Character, List<String>> characterListMap = list.stream().distinct().collect(Collectors.groupingBy(name -> name.charAt(0)));
        System.out.println(characterListMap);


    }
}
