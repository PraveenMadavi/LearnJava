package Java8.Streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Question question = new Question();
        //Names in uppercase
//        List<String> list = question.listOfNames.stream().map(String::toUpperCase).toList();
//        System.out.println(list);
//        //First char in uppercase
//        List<String> list1 = question.listOfNames.stream().map(names -> names.substring(0, 1).toUpperCase() + names.substring(1)).toList();
//        System.out.println(list1);
        //if null-names
        System.out.println(question.listOfNames.stream().filter(names -> names!=null && !names.isBlank()).map(names -> names.substring(0, 1).toUpperCase() + names.substring(1)).toList());



    }
}
