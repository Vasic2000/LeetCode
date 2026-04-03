package Easy;
//TASK.3658

public class GCDofOddAndEvenSums {
    public static void main(String[] args) {
        System.out.println(gcdOfOddEvenSums(4));
        System.out.println(gcdOfOddEvenSums(5));
        System.out.println(gcdOfOddEvenSums(1000));
    }

    private static int gcdOfOddEvenSums(int n) {
        int i = 1;
        int oddSum = 0;
        int evenSum = 0;
        while(i < n * 2) {
            if(i%2==0) {
                oddSum += i;
                i++;
            } else {
                evenSum += i;
                i++;
            }
        }
        return evenSum - oddSum;
    }
}
