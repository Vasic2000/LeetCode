package Easy;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(26));
        System.out.println(convertToTitle(52));
        System.out.println(convertToTitle(701));
        System.out.println(convertToTitle(78));
        System.out.println(convertToTitle(77));

        System.out.println(convertToTitle(1378));
        System.out.println(convertToTitle(56));
        System.out.println(convertToTitle(2731));
        System.out.println(convertToTitle(7491));
        System.out.println(convertToTitle(701));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder title = new StringBuilder();
        int remainder;
        while(columnNumber > 26) {
            remainder = columnNumber % 26;
            if(remainder == 0) {
                columnNumber--;
            }
            title.insert(0, letterFromNumber(remainder));
            columnNumber = columnNumber / 26;
        }
        remainder = columnNumber % 26;
        title.insert(0, letterFromNumber(remainder));

        return title.toString();
    }

    private static char letterFromNumber(int number) {
        switch(number) {
            case 1: return 'A';
            case 2: return 'B';
            case 3: return 'C';
            case 4: return 'D';
            case 5: return 'E';
            case 6: return 'F';
            case 7: return 'G';
            case 8: return 'H';
            case 9: return 'I';
            case 10: return 'J';
            case 11: return 'K';
            case 12: return 'L';
            case 13: return 'M';
            case 14: return 'N';
            case 15: return 'O';
            case 16: return 'P';
            case 17: return 'Q';
            case 18: return 'R';
            case 19: return 'S';
            case 20: return 'T';
            case 21: return 'U';
            case 22: return 'V';
            case 23: return 'W';
            case 24: return 'X';
            case 25: return 'Y';
            case 0: return 'Z';
        }
        return '-';
    }
}
