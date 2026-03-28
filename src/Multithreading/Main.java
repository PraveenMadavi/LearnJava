package Multithreading;

public class Main {
    public static void main(String[] args) {

//        Thread t1 = new ThreadTest(5);
//        Thread t2 = new ThreadTest(6);

        Thread t1 = new Thread(new ThreadTest(5));
        Thread t2 = new Thread(new ThreadTest(7));
        System.out.println("By run() method."); // not parallel execution
        t1.run();
        t2.run();
        System.out.println("By start() method."); // executes parallel (concurrent execution)
        t1.start();
        t2.start();
    }
}
