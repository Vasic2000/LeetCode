package Easy;

public class ScoreOfAString {
    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
        System.out.println(scoreOfString("zaz"));
        System.out.println(scoreOfString("vasic"));
    }

    private static int scoreOfString(String s) {
        char [] stringht = s.toCharArray();
        int result = 0;
        for (int i = 0; i < stringht.length-1; i++)
            result = result + Math.abs(ACSIIvalue(stringht[i]) - ACSIIvalue(stringht[i + 1]));
        return result;
    }

    private static int ACSIIvalue(char symbol) {
        switch (symbol) {
            case 'a':
                return 97;
            case 'b':
                return 98;
            case 'c':
                return 99;
            case 'd':
                return 100;
            case 'e':
                return 101;
            case 'f':
                return 102;
            case 'g':
                return 103;
            case 'h':
                return 104;
            case 'i':
                return 105;
            case 'j':
                return 106;
            case 'k':
                return 107;
            case 'l':
                return 108;
            case 'm':
                return 109;
            case 'n':
                return 110;
            case 'o':
                return 111;
            case 'p':
                return 112;
            case 'q':
                return 113;
            case 'r':
                return 114;
            case 's':
                return 115;
            case 't':
                return 116;
            case 'u':
                return 117;
            case 'v':
                return 118;
            case 'w':
                return 119;
            case 'x':
                return 120;
            case 'y':
                return 121;
            case 'z':
                return 122;
        }
        return 0;
    }
}
