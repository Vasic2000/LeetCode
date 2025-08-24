package Easy;

//        2942. Find Words Containing Character
//
//        You are given a 0-indexed array of strings words and a character x.
//        Return an array of indices representing the words that contain the character x.
//        Note that the returned array may be in any order.

import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] words1 = {"leet","code"};
        String[] words2 = {"abc","bcd","aaaa","cbc"};
        String[] words3 = {"abc","bcd","aaaa","cbc"};
        String[] words4 = {"zae","bizza","pisa","wooo"};

        System.out.println(findWordsContaining(words1, 'e'));
        System.out.println(findWordsContaining(words2, 'a'));
        System.out.println(findWordsContaining(words3, 'z'));
        System.out.println(findWordsContaining(words4, 'i'));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        String find = String.valueOf(x);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if(words[i].contains(find)) {result.add(i);
            }
        }
        return result;
    }
}
