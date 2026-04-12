package Inheritance;

public class B extends A{
    int x = 20;
    public void m2(){
        System.out.println("From class B : x = " + x);
    }

    public static void main(String[] args) {

        B b1 = new B();
        A a = new B();
        b1.m1();
        b1.m2();
    }
}
