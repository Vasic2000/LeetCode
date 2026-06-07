package Easy;
//TASK.3945. Digit Frequency Score (N1 x D1 + N2 * D2 ... -> Sume of digits)

public class DigitFrequenceScore {
    public static void main(String[] args) {
        System.out.println(digitFrequencwScore(122));
        System.out.println(digitFrequencwScore(101));
        System.out.println(digitFrequencwScore(235509));
    }

    private static int digitFrequencwScore(int n) {
        int result = 0;

        while(n >= 1) {
            result = result + n % 10;
            n = n / 10;
        }
        return result;
    }
}
