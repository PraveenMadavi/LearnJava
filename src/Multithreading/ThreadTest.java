package Multithreading;

public class ThreadTest implements Runnable{
    int x;
    public ThreadTest (int x){
        this.x = x;
    }

    @Override
    public void run() {
        for (int i =1 ;i <=10;i++){
            System.out.println(i*x+" Thread id : "+Thread.currentThread().threadId());
//            try {
//                Thread.sleep(0);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}

