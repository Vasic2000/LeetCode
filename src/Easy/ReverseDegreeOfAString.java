package Easy;

//Task.3498
//Given a string s, calculate its reverse degree.
//The reverse degree is calculated as follows:
//For each character, multiply its position in the reversed alphabet ('a' = 26, 'b' = 25, ..., 'z' = 1) with its position in the string (1-indexed).
//Sum these products for all characters in the string.
//Return the reverse degree of s.

public class ReverseDegreeOfAString {
    public static void main(String[] args) {
        System.out.println("abc = " + reverseDegree("abc"));
        System.out.println("zaza = " + reverseDegree("zaza"));
        System.out.println("basics = " + reverseDegree("basics"));
    }

    private static int reverseDegree(String s) {
        char[] string = s.toCharArray();
        int result = 0;
        for (int i = 0; i < string.length; i++) {
            result += degree(string[i])*(i+1);
        }
        return result;
    }

    private static int degree(char c) {
        switch (c) {
            case 'a':
                return 26;
            case 'b':
                return 25;
            case 'c':
                return 24;
            case 'd':
                return 23;
            case 'e':
                return 22;
            case 'f':
                return 21;
            case 'g':
                return 20;
            case 'h':
                return 19;
            case 'i':
                return 18;
            case 'j':
                return 17;
            case 'k':
                return 16;
            case 'l':
                return 15;
            case 'm':
                return 14;
            case 'n':
                return 13;
            case 'o':
                return 12;
            case 'p':
                return 11;
            case 'q':
                return 10;
            case 'r':
                return 9;
            case 's':
                return 8;
            case 't':
                return 7;
            case 'u':
                return 6;
            case 'v':
                return 5;
            case 'w':
                return 4;
            case 'x':
                return 3;
            case 'y':
                return 2;
            case 'z':
                return 1;
        }
        return 0;
    }

//    public int reverseDegree(String s) {
//        int ans = 0;
//
//        for (int i = 1; i <= s.length(); i++) {
//            ans += ('z' - s.charAt(i - 1) + 1) * i;
//        }
//
//        return ans;
//    }
}
