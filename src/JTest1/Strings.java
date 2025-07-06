package JTest1;

public class Strings {
    static class Solution {
        public String longestPalindrome(String s) {
            if (s == null || s.isEmpty()) return "";

            int start = 0, end = 0;

            for (int i = 0; i < s.length(); i++) {
                int len1 = expandFromCenter(s, i, i);     // Odd-length palindrome
                int len2 = expandFromCenter(s, i, i + 1); // Even-length palindrome
                int len = Math.max(len1, len2);

                if (len > (end - start)) {
                    start = i - (len - 1) / 2;
                    end = i + len / 2;
                }
            }
            return s.substring(start, end + 1);
        }

        private int expandFromCenter(String s, int left, int right) {
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            return right - left - 1; // Length of palindrome
        }
    }


    public static void main(String[] args) {
        String name = "Pravin";
        String name2 = "Madavi";
        System.out.println("a".length());

//        System.out.println(
//        name.replace("Pra","Ra")
//        );
//
//        System.out.println(
//                name2.compareTo("Madavi")  //returns 0 if exactly matches, greater int if bigger and smaller than 0 if smaller
//        );
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
//        System.out.println("test substring");
//        System.out.println(name.substring(0, 2));
//        System.out.println(name2.substring(3));
//        StringBuilder stringBuilder;
//        stringBuilder = new StringBuilder("Pravin");
//        System.out.println(stringBuilder.reverse());
        System.out.println("largest palindrome");

        Solution solution = new Solution();
        System.out.println(solution.longestPalindrome("m"));


        //There are lots of string methods for test..
    }
}
