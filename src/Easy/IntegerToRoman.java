package Easy;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println("12 = " + intToRom(12));
        System.out.println("1024 = " + intToRom(1024));
        System.out.println("201 = " + intToRom(201));
        System.out.println("15 = " + intToRom(15));
        System.out.println("1994 = " + intToRom(1994));
    }

    public static String intToRom(int num) {
        StringBuilder result = new StringBuilder();
        if ((num < 1) || (num > 3999))
            result.append("--");
        else {
            int thousands = num / 1000;
            int hundreds = (num - num / 1000 * 1000) / 100;
            int dozens = (num - num / 100 * 100) / 10;
            int units = (num - num / 10 * 10);
//
//            System.out.print(thousands + " ");
//            System.out.print(hundreds + " ");
//            System.out.print(dozens + " ");
//            System.out.println(units + " ");

            switch (thousands) {
                case 3:
                    result.append("MMM");
                    break;
                case 2:
                    result.append("MM");
                    break;
                case 1:
                    result.append("M");
            }

            switch (hundreds) {
                case 9:
                    result.append("CM");
                    break;
                case 8:
                    result.append("DCCC");
                    break;
                case 7:
                    result.append("DCC");
                    break;
                case 6:
                    result.append("DC");
                    break;
                case 5:
                    result.append("D");
                    break;
                case 4:
                    result.append("CD");
                    break;
                case 3:
                    result.append("CCC");
                    break;
                case 2:
                    result.append("CC");
                    break;
                case 1:
                    result.append("C");
            }

            switch (dozens) {
                case 9:
                    result.append("XC");
                    break;
                case 8:
                    result.append("LXXX");
                    break;
                case 7:
                    result.append("LXX");
                    break;
                case 6:
                    result.append("LX");
                    break;
                case 5:
                    result.append("L");
                    break;
                case 4:
                    result.append("XL");
                    break;
                case 3:
                    result.append("XXX");
                    break;
                case 2:
                    result.append("XX");
                    break;
                case 1:
                    result.append("X");
            }

            switch (units) {
                case 9:
                    result.append("IX");
                    break;
                case 8:
                    result.append("VIII");
                    break;
                case 7:
                    result.append("VII");
                    break;
                case 6:
                    result.append("VI");
                    break;
                case 5:
                    result.append("V");
                    break;
                case 4:
                    result.append("IV");
                    break;
                case 3:
                    result.append("III");
                    break;
                case 2:
                    result.append("II");
                    break;
                case 1:
                    result.append("I");
            }
        }

        return result.toString();
    }

}
