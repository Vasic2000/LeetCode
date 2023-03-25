package Easy;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        System.out.println(titleToNumber("AZZ"));
        System.out.println(titleToNumber("BD"));
        System.out.println(titleToNumber("DAA"));
        System.out.println(titleToNumber("KBC"));
        System.out.println(titleToNumber("ZY"));
    }

    public static int titleToNumber(String columnTitle) {
        int result = 1;

        char[] list = columnTitle.toCharArray();

        result = numericNumber(list[list.length - 1]);

        for (int i = list.length - 1; i > 0; i--) {
            result = result + (int) Math.pow(26, list.length - i) * numericNumber(list[i - 1]);
        }

        return result;
    }

    public static int numericNumber(char letter) {

        switch (letter) {
            case 'A':
                return 1;
            case 'B':
                return 2;
            case 'C':
                return 3;
            case 'D':
                return 4;
            case 'E':
                return 5;
            case 'F':
                return 6;
            case 'G':
                return 7;
            case 'H':
                return 8;
            case 'I':
                return 9;
            case 'J':
                return 10;
            case 'K':
                return 11;
            case 'L':
                return 12;
            case 'M':
                return 13;
            case 'N':
                return 14;
            case 'O':
                return 15;
            case 'P':
                return 16;
            case 'Q':
                return 17;
            case 'R':
                return 18;
            case 'S':
                return 19;
            case 'T':
                return 20;
            case 'U':
                return 21;
            case 'V':
                return 22;
            case 'W':
                return 23;
            case 'X':
                return 24;
            case 'Y':
                return 25;
            case 'Z':
                return 26;
        }
        return 0;
    }
}
