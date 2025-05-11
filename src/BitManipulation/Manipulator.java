package BitManipulation;

public class Manipulator {

    public static int get(int number, int pos){
        return (number >> pos) & 1;
//        if(pos>31){
//            System.out.println("The size of int is only 32 bit so you can't get to know the bit pos greater than 31;");
//            return;
//        }
//        int bitmask = 1<<pos;
//        if ((bitmask & number)==0) System.out.println("The number is zero");
//        else System.out.println("The number is one");
    }

    public static int set(int number,int pos){
//        int bitMask = 1<<pos;
//        int newNumber = bitMask | number ;
//        System.out.println(newNumber);
        return 1<<pos | number;
    }

    public static int clear(int number, int pos){
//        int bitMask = 1<<pos;
//        int notMask = ~ bitMask;
//        System.out.println(number & notMask);
        return  ~(1<<pos) & number;
    }

    //update
    public static int update(int number,int pos, int value){
//        number = number & ~(1<<pos);  // clears
//       return number | (value<<pos);  //sets
        return clear(number,pos) | (value<<pos);
    }

    public static void main(String[] args) { //.................

//        System.out.println("(Get)The bit is : " + get(5,3));
//        System.out.println(set(5,1));
//        System.out.println(clear(5,1));
//        System.out.println(update(5,1,1));
//        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(~i);
        }


    }
}
