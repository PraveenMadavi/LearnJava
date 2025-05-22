package Permutation;

public class Backtracking {
    public static void permutations(String str, String perm,int idx){
        if (str.isEmpty()) System.out.println(perm+ "  @ "+idx);
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            String newStr = str.substring(0,i)+ str.substring(i+1);
            permutations(newStr,perm+currentChar,idx=1);
        }
    }

    public static void main(String[] args) {
        String str = "ABC";
        permutations(str,"",0);
    }
}
