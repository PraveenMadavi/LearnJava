package JTest1;
//static variables remember their previous value
//static variables are same for every object.
public class Calc {
    static int x = 10;
    int y = 12;
    public static void main(String[] args){
        Calc calc1 = new Calc();
        Calc calc2 = new Calc();
        calc1.x += 10;
//        System.out.println(calc1.x);
        calc2.x += 20;

        calc1.y +=10;
        System.out.println(calc1.y);
        calc2.y +=10;
        System.out.println(calc2.y);
        System.out.println(calc1.y+=10);
        System.out.println("-------------");

//        System.out.println(calc2.x);
//        System.out.println("And SUM");
//        System.out.println(calc1.x + calc2.y);

    }
}
