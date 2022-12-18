package Easy;

public class MySqrt {

    public static void main(String[] args) {
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(9));
        System.out.println(mySqrt(11));
        System.out.println(mySqrt(144));
        System.out.println(mySqrt(13654));
        System.out.println(mySqrt(2147395600));
    }

    public static int mySqrt(int x) {
        int sqr = 1;
        while(((sqr * sqr) <= x) && (sqr * sqr >= 0)) {
            sqr++;
        }
        return sqr - 1;
    }
}
