package Java8.Streams;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.security.KeyPair;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Question question = new Question();

        System.out.println(question.listOfNames);

        Map<String, Integer> mappedNames = question.listOfNames.stream()
                .filter(names -> names != null && !names.isBlank())
//                .distinct()
                .collect(Collectors.toMap(names -> names, String::length,(existing,replacement)->existing));
        System.out.println(mappedNames);
//        mappedNames.forEach((k,v)-> System.out.println(k +"--"+v));  //JUST FOR FUN TEST

        //Names in uppercase
//        List<String> list = question.listOfNames.stream().map(String::toUpperCase).toList();
//        System.out.println(list);
//        //First char in uppercase
//        List<String> list1 = question.listOfNames.stream().map(names -> names.substring(0, 1).toUpperCase() + names.substring(1)).toList();
//        System.out.println(list1);
        //if null-names
//        System.out.println(question.listOfNames.stream().filter(names -> names!=null && !names.isBlank()).map(names -> names.substring(0, 1).toUpperCase() + names.substring(1)).toList());
//        //same but with different
//        System.out.println(question.listOfNames.stream().filter(names -> names!=null && !names.isBlank()).map(names -> Character.toUpperCase(names.charAt(0))+names.substring(1)).toList());

//        Stream<String> streamedNames = question.listOfNames.stream();   // ONE TIME USE ONLY, NOT LIKE STORAGE MEDIA
//        Optional<String> streamedNamesFirst = streamedNames.findFirst(); // Here 'streamedNames' is consumed so you can't use again.
//        streamedNamesFirst.ifPresent(System.out::println);

//        List<String> distinctNames = question.listOfNames.stream().distinct().toList();
//        System.out.println(distinctNames);

        List<Integer> list = Arrays.asList(5, 3, 5, 6, 8, 2, 1, 7, 6, 7, 9);
//        List<Integer> sortedList = list.stream().sorted().toList();
//        System.out.println(sortedList);
//
//        list.stream().sorted(Comparator.reverseOrder()).toList().forEach(System.out::println);
//        List<Integer> list1 = list.stream().distinct().sorted().toList();
//        System.out.println(list1);

//        System.out.println("list.stream().filter(n-> n > 5).count() = " + list.stream().filter(n -> n > 5).count());
//
//        System.out.println("list.stream().max(Integer::compareTo) = " + list.stream().max(Integer::compareTo));
//        System.out.println("list.stream().min(Integer::compareTo) = " + list.stream().min(Integer::compareTo));


    }
}
