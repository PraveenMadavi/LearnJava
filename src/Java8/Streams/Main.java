package Java8.Streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Question question = new Question();

        List<String> list = question.listOfNames.stream().map(String::toUpperCase).toList();
        System.out.println(list);

    }
}
