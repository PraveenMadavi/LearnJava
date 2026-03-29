package Java8.Streams;

import java.util.List;

public class Streams {

    public int sumOfInts(List<Integer> ints){
       return ints.parallelStream().mapToInt(Integer::intValue).sum();


//        return ints.parallelStream().filter(num -> num % 2 == 0).mapToInt(Integer::intValue).sum();
    }

    public void evens(List<Integer> ints){
//        ints.stream().filter(n -> n % 2 == 0 ).forEach(System.out::println);
       List<Integer> evens = ints.stream().filter(n -> n % 2 ==0 ).toList();
        for (Integer even : evens) {
            System.out.println(even);
        }
        System.out.println();
        evens.forEach(System.out::println);
    }


    public static void main(String[] args) {
        List<Integer> ints =  List.of(1, 2, 3, 4, 5);
        Streams streams = new Streams();
        System.out.println(streams.sumOfInts(ints));
//        System.out.println("---");
////        System.out.println(Integer.toBinaryString(2));
//
//        System.out.println("evens");
//        streams.evens(ints);
//        System.out.println("Printing ints...");
//        System.out.println(ints);
//
//        Predicate<Integer>


    }
}

