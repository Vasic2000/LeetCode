package Easy;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
//        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28));
//        System.out.println(convertToTitle(701));
//        System.out.println(convertToTitle(731));
//        System.out.println(convertToTitle(1378));
//        System.out.println(convertToTitle(2731));
//        System.out.println(convertToTitle(7491));
//        System.out.println(convertToTitle(26));
//        System.out.println(convertToTitle(52));
//        System.out.println(convertToTitle(78));
    }


    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        int remainder;

        while((double) columnNumber / 26 > 1) {
            remainder = columnNumber % 26;
            result.insert(0, numToLetter(remainder));
            if((columnNumber - remainder) % 26 == 0) {
                columnNumber = (columnNumber - remainder) / 26 - 1;
            }
            else {
                columnNumber = (columnNumber - remainder) / 26;
            }
        }
        if(columnNumber != 0) {
            remainder = columnNumber % 26;
            result.insert(0, numToLetter(remainder));
        }

        return result.toString();
    }

    private static char numToLetter(int remainder) {
        switch (remainder) {
            case 0:
                return 'Z';
            case 1:
                return 'A';
            case 2:
                return 'B';
            case 3:
                return 'C';
            case 4:
                return 'D';
            case 5:
                return 'E';
            case 6:
                return 'F';
            case 7:
                return 'G';
            case 8:
                return 'H';
            case 9:
                return 'I';
            case 10:
                return 'J';
            case 11:
                return 'K';
            case 12:
                return 'L';
            case 13:
                return 'M';
            case 14:
                return 'N';
            case 15:
                return 'O';
            case 16:
                return 'P';
            case 17:
                return 'Q';
            case 18:
                return 'R';
            case 19:
                return 'S';
            case 20:
                return 'T';
            case 21:
                return 'U';
            case 22:
                return 'V';
            case 23:
                return 'W';
            case 24:
                return 'X';
            case 25:
                return 'Y';
        }
        return '*';
    }
}
