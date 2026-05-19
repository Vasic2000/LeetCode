package Easy;
//TASK.2520

public class CountTheDigitsThatDivideANumber {
    public static void main(String[] args) {
        System.out.println("7 => " + countDigits(7));
        System.out.println("121 => " + countDigits(121));
        System.out.println("1248 => " + countDigits(1248));
        System.out.println("33 => " + countDigits(33));
        System.out.println("34 => " + countDigits(34));
        System.out.println("35 => " + countDigits(35));
    }

    private static int countDigits(int num) {
        String intN = String.valueOf(num);
        int digit;
        int result = 0;

        if(intN.length() > 0) {
            digit = Integer.parseInt(intN.substring(0,1));
            if(num % digit == 0 ) {
                result++;
            }

            for (int i = 2; i <= intN.length(); i++) {
                digit = Integer.parseInt(intN.substring(i - 1,i));
                if(num % digit == 0 ) {
                    result++;
                }
            }
        }
        return result;
    }
}
