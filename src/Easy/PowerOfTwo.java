package Easy;

public class PowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(3));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(13));
        System.out.println(isPowerOfTwo(128));
        System.out.println(isPowerOfTwo(-1));
        System.out.println(isPowerOfTwo(-3));
        System.out.println(isPowerOfTwo(-16));
        System.out.println(isPowerOfTwo(-13));
        System.out.println(isPowerOfTwo(-128));

    }

    public static boolean isPowerOfTwo(int n) {
        while(n * n > 4) {
            if(n < 1) return false;
            if(n%2 != 0) return false;
            else
                n/=2;
        }
        return true;
    }
}
