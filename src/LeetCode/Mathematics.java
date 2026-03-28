package LeetCode;

public class Mathematics { // my reversing int is not perfect. so provided code at last is correct one from gpt
//    int rev = 0;
//    while (x != 0) {
//        int reminder = x % 10;
//        x /= 10;
//
//        // Check for overflow before multiplying
//        if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && reminder > 7)) return 0;
//        if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && reminder < -8)) return 0;
//
//        rev = rev * 10 + reminder;
//    }
//    return rev;
    public int reverse(int x) {
        try {
            int revInt = reverseInt(Math.abs(x));
            if (x < 0) revInt = Math.negateExact(revInt);
            return revInt;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    int power = 0;

    private int reverseInt(int devident) {
        if (devident < 10) {
            return (int) (Math.pow(10, power++) * devident);
        }
        int quotient = devident / 10;
        int reminder = devident % 10;
        int returnInt = reverseInt(quotient);
        int result = (int) Math.pow(10, power++) * reminder;
        return returnInt + result;
    }


    public static void main(String[] args) {
        Mathematics mt = new Mathematics();
        System.out.println(mt.reverse(994236468));
    }
}
