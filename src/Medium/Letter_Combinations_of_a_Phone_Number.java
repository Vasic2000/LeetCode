package Medium;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/letter-combinations-of-a-phone-number/

public class Letter_Combinations_of_a_Phone_Number {
    public static void main(String[] args) {
        printList(letterCombinations("7797"));
        printSize(letterCombinations("7797"));
    }

    private static List<String> letterCombinations(String digits) {
        char[] string = digits.toCharArray();
        for (int i = 0; i < string.length; i++) {
            string[i] = makeNull(string[i]);
        }

        List result = new ArrayList<String>();

        if(string.length > 0) {
            result.add(makeWord(string));
        } else {
            return result;
        }

        while (stepForward(string)) {
            result.add(makeWord(string));
        }
        return result;
    }

    private static boolean stepForward(char[] str) {

        int j = str.length - 1;

        while (j >= 0) {
            if (!isLast(str[j])) {
                str[j] = plusOne(str[j]);
                return true;
            } else {
                if(((j > 0)&&!isLast(str[j-1]))) {
                    for(int k = j; k < str.length; k++) {
                        str[k] = makeNull(str[k]);
                    }
                    str[j-1] = plusOne(str[j-1]);
                    return true;
                } else {
                    j--;
                }
            }
        }
        return false;
    }

    private static char makeNull(char c) {
        switch(c) {
            case '2': c = 'a';
                break;
            case 'b': c = 'a';
                break;
            case 'c': c = 'a';
                break;

            case '3': c = 'd';
                break;
            case 'e': c = 'd';
                break;
            case 'f': c = 'd';
                break;

            case '4': c = 'g';
                break;
            case 'h': c = 'g';
                break;
            case 'i': c = 'g';
                break;

            case '5': c = 'j';
                break;
            case 'k': c = 'j';
                break;
            case 'l': c = 'j';
                break;

            case '6': c = 'm';
                break;
            case 'n': c = 'm';
                break;
            case 'o': c = 'm';
                break;

            case '7': c = 'p';
                break;
            case 'q': c = 'p';
                break;
            case 'r': c = 'p';
                break;
            case 's': c = 'p';
                break;

            case '8': c = 't';
                break;
            case 'u': c = 't';
                break;
            case 'v': c = 't';
                break;

            case '9': c = 'w';
                break;
            case 'x': c = 'w';
                break;
            case 'y': c = 'w';
                break;
            case 'z': c = 'w';
                break;
        }
        return c;
    }

    private static char plusOne(char c) {
        switch(c) {
            case 'a': c = 'b';
                break;
            case 'b': c = 'c';
                break;

            case 'd': c = 'e';
                break;
            case 'e': c = 'f';
                break;

            case 'g': c = 'h';
                break;
            case 'h': c = 'i';
                break;

            case 'j': c = 'k';
                break;
            case 'k': c = 'l';
                break;

            case 'm': c = 'n';
                break;
            case 'n': c = 'o';
                break;

            case 'p': c = 'q';
                break;
            case 'q': c = 'r';
                break;
            case 'r': c = 's';
                break;

            case 't': c = 'u';
                break;
            case 'u': c = 'v';
                break;
            case 'w': c = 'x';
                break;

            case 'x': c = 'y';
                break;
            case 'y': c = 'z';
                break;
        }
        return c;
    }

    private static boolean isLast(char c) {
        if ((c == 'c') || (c == 'f') ||
                (c == 'i') || (c == 'l') ||
                (c == 'o') || (c == 's') ||
                (c == 'v') || (c == 'z')) {
            return true;
        }
        return false;
    }

    private static String makeWord(char[] string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length; i++)
            result.append(string[i]);
        return result.toString();
    }

    private static void printList(List<String> list) {
        if (list.size() != 0) {
            for (int i = 0; i < list.size() - 1; i++) {
                System.out.print(list.get(i) + ", ");
            }
            System.out.println(list.get(list.size() - 1));
        } else {
            System.out.println();
        }
    }

    private static void printSize(List<String> list) {
        System.out.println(list.size());
    }
}