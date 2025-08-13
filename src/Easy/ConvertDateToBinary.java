package Easy;

public class ConvertDateToBinary {
    public static void main(String[] args) {
        String date1 = "2080-02-29";
        String date2 = "1900-01-01";
        String date3 = "2079-12-31";
        String date4 = "1901-11-30";

        System.out.println(date1);
        System.out.println(convertDateToBinary(date1));
        System.out.println(date2);
        System.out.println(convertDateToBinary(date2));
        System.out.println(date3);
        System.out.println(convertDateToBinary(date3));
        System.out.println(date4);
        System.out.println(convertDateToBinary(date4));
    }

    public static String convertDateToBinary(String date) {
        String[] dat = date.split("-");
        StringBuilder result = new StringBuilder();
        result.append(decimalToBinary(dat[0]));
        result.append('-');
        result.append(decimalToBinary(dat[1]));
        result.append('-');
        result.append(decimalToBinary(dat[2]));
        return result.toString();
    }

    public static String decimalToBinary(String date) {
        int dat = Integer.parseInt(date);
        StringBuilder result = new StringBuilder();
        while (dat / 2 > 0) {
            result.append(dat % 2);
            dat = dat / 2;
        }
        if (dat % 2 != 0) result.append(dat % 2);
        result.reverse();
        return result.toString();
    }
}
