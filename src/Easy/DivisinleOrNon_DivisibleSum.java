package Easy;

public class DivisinleOrNon_DivisibleSum {
    public static void main(String[] args) {
        int n1 = 10;
        int m1 = 3;

        int n2 = 5;
        int m2 = 6;

        int n3 = 5;
        int m3 = 1;

        System.out.println(differenceOfSums(n1,m1));
        System.out.println(differenceOfSums(n2,m2));
        System.out.println(differenceOfSums(n3,m3));
    }
    public static int differenceOfSums(int n, int m) {
        int num1 = 0;
        int num2 = 0;
        for (int i = 1; i <= n; i++) {
            if ((float)i % m != 0) {
                num1 += i;
            } else {
                num2 += i;
            }
        }
        return num1 - num2;
    }
}
