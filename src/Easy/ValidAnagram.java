package Easy;
//TASK.242 Valid Anagram

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("rat", "car"));
        System.out.println(isAnagram("mamnam", "amnamm"));
        System.out.println(isAnagram("aa", "am"));
        System.out.println(isAnagram("a", "am"));
    }

    private static boolean isAnagram(String s, String t) {
//        Corner case
        if(s.length()!= t.length())
            return false;

        char[] stringS = s.toCharArray();
        char[] stringT = t.toCharArray();

//        TimeLimit desigion
//
//        for (int i = 0; i < stringS.length; i++) {
//            for (int j = 0; j < stringT.length; j++) {
//                if ((stringS[i]!=' ')&&(stringS[i] == stringT[j])) {
//                    stringS[i] = ' ';
//                    stringT[j] = ' ';
//                }
//            }
//        }
//
//        boolean result = true;
//
//        for (int i = 0; i < stringS.length; i++) {
//            if(stringS[i]!=' ')
//                result = false;
//        }
//
//        return result;

        HashMap<Character, Integer> anagramm = new HashMap<>();

        int j = 0;

        for (int i = 0; i < stringS.length; i++) {
            if(anagramm.containsKey(stringS[i])) {
                j = anagramm.get(stringS[i]);
                j++;
                anagramm.put(stringS[i], j);
            } else {
                anagramm.put(stringS[i], 1);
            }
        }

        boolean result = true;

        for (int i = 0; i < stringT.length; i++) {
            if(!anagramm.containsKey(stringT[i])) {
                return false;
            } else {
                j = anagramm.get(stringT[i]);
                if(j > 1) {
                    j--;
                    anagramm.put(stringT[i], j);
                } else {
                    anagramm.remove(stringT[i]);
                }
            }
        }
        return result;
    }
}
