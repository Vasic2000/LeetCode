package Easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        int n1 = 19, n2 = 2, n3 = 1, n4 = 189, n5 = 1111111;
        System.out.println(n1 + " - " + isHappy(n1));
        System.out.println(n2 + " - " + isHappy(n2));
        System.out.println(n3 + " - " + isHappy(n3));
        System.out.println(n4 + " - " + isHappy(n4));
        System.out.println(n5 + " - " + isHappy(n5));
    }

    public static boolean isHappy(int n) {
        Set answers = new HashSet();
        long result = 0;
        int [] cifry = makeCifry(n);
        answers.add(n);

        for(int i = 0; i < cifry.length; i++) {
            result += Integer.valueOf(cifry[i]) * Integer.valueOf(cifry[i]);
        }

        cifry = makeCifry(result);

        while((result != 1) && (!answers.contains(result))) {
            answers.add(result);
            result = 0;
            for(int i = 0; i < cifry.length; i++) {
                result += Integer.valueOf(cifry[i]) * Integer.valueOf(cifry[i]);
            }
            cifry = makeCifry(result);
        }

        if(result == 1)
            return true;
        else
            return false;
    }

    private static int[] makeCifry(long n) {
        char[] charCifr = String.valueOf(n).toCharArray();
        int[] cifrI= new int[charCifr.length];
        for (int i = 0; i < cifrI.length; i++) {
            cifrI[i] = charCifr[i] - '0';
        }
        return cifrI;
    }
}
