package Java8.Streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Question question = new Question();

        System.out.println(question.listOfNames);
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

        List<String> distinctNames = question.listOfNames.stream().distinct().toList();
        System.out.println(distinctNames);


    }
}
