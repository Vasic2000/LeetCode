package Easy;

//258. Add Digits
//Input: num = 38
//Output: 2
//Explanation: The process is
//  38 --> 3 + 8 --> 11
//  11 --> 1 + 1 --> 2
//  Since 2 has only one digit, return it.

public class AddDigits {
    public static void main(String[] args) {
        System.out.println(38 + " -> " + addDigit(38));
        System.out.println(0 + " -> " + addDigit(0));
        System.out.println(1072939 + " -> " + addDigit(1072939));
    }

    private static int addDigit(int i) {
        while(i > 9) {
            i = reFormat(i);
        }
        return i;
    }

    private static int reFormat(int i) {
        String digits = String.valueOf(i);

        i = 0;
        char[] dg = digits.toCharArray();
        for (int j = 0; j < digits.length(); j++) {
            i = i + Integer.parseInt(String.valueOf(digits.charAt(j)));
        }
        return i;
    }
}
