package Easy;
//        TASK.804
//        Given an array of strings words where each word can be written as a concatenation of the Morse code of each letter.
//        We will call such a concatenation the transformation of a word.
//        Return the number of different transformations among all words we have.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class UnicMorseCodeWords {
    public static void main(String[] args) {
            String[] strings1 = {"gin","zen","gig","msg"};
            String[] strings2 = {"a"};
            String[] strings3 = {"vtpke","vngc","vnqr","gbzx","qvdx"};
            System.out.println(unicMorseRepresentation(strings1));
            System.out.println(unicMorseRepresentation(strings2));
            System.out.println(unicMorseRepresentation(strings3));
        }

        private static int unicMorseRepresentation(String[] words) {
            // Конвертация в HashSet
            String[] morseWords = new String[words.length];

            for (int i = 0; i < words.length; i++) {
                morseWords[i] = morswMade(words[i]);
            }

            Set<String> set = new HashSet<String>(Arrays.asList(morseWords));
            String[] result = set.toArray(new String[set.size()]);

            return result.length;
    }

    private static String morswMade(String word) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            result.append(morseCharMake(word.charAt(i)));
        }
        return result.toString();
    }

    private static String morseCharMake(char c) {
        switch(c) {
            case 'a':
                return ".-";
            case 'b':
                return "-...";
            case 'c':
                return "-.-.";
            case 'd':
                return "-..";
            case 'e':
                return ".";
            case 'f':
                return "..-.";
            case 'g':
                return "--.";
            case 'h':
                return "....";
            case 'i':
                return "..";
            case 'j':
                return ".---";
            case 'k':
                return "-.-";
            case 'l':
                return ".-..";
            case 'm':
                return "--";
            case 'n':
                return "-.";
            case 'o':
                return "---";
            case 'p':
                return ".--.";
            case 'q':
                return "--.-";
            case 'r':
                return ".-.";
            case 's':
                return "...";
            case 't':
                return"-";
            case 'u':
                return "..-";
            case 'v':
                return "...-";
            case 'w':
                return ".--";
            case 'x':
                return "-..-";
            case 'y':
                return "-.--";
            case 'z':
                return "--..";
        }
        return null;
    }
}
