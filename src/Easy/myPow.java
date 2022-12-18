package Easy;

public class myPow {
    public static void main(String[] args) {
        System.out.println(myPow(2,10));
        System.out.println(myPow(2.1,3));
        System.out.println(myPow(2,-2));
        System.out.println(myPow(0.44528,0));
    }

    public static double myPow(double x, int n) {

            if(n > Integer.MAX_VALUE) return x;
            if(n < Integer.MIN_VALUE) return x;

            if(x > 100) return x;
            if(x < -100) return x;

            if(n == 1)
                return x;
            else if(n == 0)
                return 1;
            else if(n > 1) {
                double result = 1;
                for(int i = 0; i < n; i++) {
                    result *= x;
                }
                return result;
            }
            else {
                double result = 1;
                for(int i = 0; i > n; i--) {
                    result /= x;
                }
                return result;
            }
    }
}
