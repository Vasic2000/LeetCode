package Easy;
//TASK.2549

public class CountDistinctNumbersOnBoard {
    public static void main(String[] args) {
        System.out.println(distinctIntegers(5));
        System.out.println(distinctIntegers(3));
        System.out.println(distinctIntegers(14));
        System.out.println(distinctIntegers(99));
    }

    private static int distinctIntegers(int n) {
        int res [] = new int[n];
        res[n-1] = n;

        for (int i = n; i > 0 ; i--) {
            for (int j = 1; j < i; j++) {
                if(i%j == 1) {
                    if(res[j-1]==0)
                        res[j-1] = j;
                }
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            if(res[i]!=0)
                result++;
        }
        return result;
    }
}
