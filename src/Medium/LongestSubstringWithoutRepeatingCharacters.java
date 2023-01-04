package Medium;
//My - time Limit exceed

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "aab";
        String s5 = "abcaaaabcde*fhjkabc";
        String s6 = "";
        String s7 = "dvdf";
        String s8 = "asjrgapa";
        String s9 = "au";
        String s10 = "hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789hijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
        System.out.println(lengthOfLongestSubstring(s4));
        System.out.println(lengthOfLongestSubstring(s5));
        System.out.println(lengthOfLongestSubstring(s6));
        System.out.println(lengthOfLongestSubstring(s7));
        System.out.println(lengthOfLongestSubstring(s8));
        System.out.println(lengthOfLongestSubstring(s9));
        System.out.println(lengthOfLongestSubstring(s10));
    }

//    public static int lengthOfLongestSubstring(String s) {
//        char [] string = s.toCharArray();
//        int totalMax = 0;
//        for(int j = 0; j < s.length(); j++) {
//            char[] different = new char[s.length() - j+1];
//            int max = 0;
//            for (int i = j; i < s.length(); i++)
//                if (!isHas(different, string[i])) {
//                    max++;
//                    different[max] = string[i];
//                } else {
//                    totalMax = Math.max(totalMax, max);
//                    max = 1;
//                    different = new char[s.length() - j + 1];
//                    different[1] = string[i];
//                }
//            totalMax = Math.max(totalMax, max);
//        }
//        return totalMax;
//    }
//
//    private static boolean isHas(char[] different, char s) {
//        for(int i =0; i < different.length; i++)
//            if(different[i] == s)
//                return true;
//        return false;
//    }
//


    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        char [] string = s.toCharArray();
        HashSet<Character> different = new HashSet<>();
        int totalMax = 0;
        for (int i = 0; i < string.length; i++) {
            different.clear();
            for(int j = i; j < string.length; j++) {
                if (different.contains(string[j])) {
                    totalMax = Math.max(totalMax, different.size());
                    different.clear();
                }
                different.add(string[j]);
            }
            totalMax = Math.max(different.size(), totalMax);
        }
        return totalMax;
    }
}
