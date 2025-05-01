package JTest1;

public class RevStr {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("MADAVI");

        System.out.println(sb);
        int  start =0;
        int  end = sb.length()-1;
        int count=0;

        while (start < end){
            count++;
            char tempChar= sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end,tempChar);
            start++;
            end--;
        }
        System.out.println(sb);
        System.out.println(count);
    }
}
