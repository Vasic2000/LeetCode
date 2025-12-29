package Easy;

//Task.3760

import java.util.HashSet;
import java.util.Set;

public class MaximumSubstringsWithDistinctStart {
    public static void main(String[] args) {
        System.out.println("abab -> " + maxDistinct("abab"));
        System.out.println("abcd -> " + maxDistinct("abcd"));
        System.out.println("aaaa -> " + maxDistinct("aaaa"));
        System.out.println("abacad -> " + maxDistinct("abacad"));
    }

    public static int maxDistinct(String s) {
        int result = 0;
        Set<Character> seenChars = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            if(!seenChars.contains(s.charAt(i))) {
                result++;
                seenChars.add(s.charAt(i));
            }
        }
        return result;
    }
}
