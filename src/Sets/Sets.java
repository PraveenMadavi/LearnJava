package Sets;

import java.util.*;

public class Sets {
    public static void  main(String[] args){
        Set<String> nameSet = new HashSet<>();
        nameSet.add("Vilas");
        nameSet.add("Rishi");
        nameSet.add("Sanjay");
        nameSet.add("Suvansh");
        nameSet.add("John");
        nameSet.add("Vilas"); //set does not add duplicates

        System.out.println(nameSet);

        nameSet.remove("John");
        System.out.println(nameSet);

        //for each
        nameSet.forEach(System.out::println);

        System.out.println("By using Iterator");
        Iterator<String> nameSetIterator = nameSet.iterator();
        while (nameSetIterator.hasNext()){
            System.out.println(nameSetIterator.next());
        }


        System.out.println("NumberList");
        List<Integer> numberList= new ArrayList<>();
        numberList.add(12);
        numberList.add(13);
        numberList.add(34);
        numberList.add(50);
        numberList.add(12);
        numberList.add(134);
        numberList.add(50);

        System.out.println(numberList);

        //By using set : we can remove doublicate numbers
        Set<Integer> numberSet = new HashSet<>(numberList);
        System.out.println(numberSet);
    }
}
