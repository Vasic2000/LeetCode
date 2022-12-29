package Easy;

public class firstBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(2126753390));
    }

    public static boolean isBadVersion(long version) {
        if (version >= 2126753390)
            return true;
        else
            return false;
    }

    public static int firstBadVersion(int n) {
//        int firstVersion = n / 2;
//        int interval = firstVersion;
//
//        while (true) {
//            interval = interval - interval/2 + interval%2;
//            if (isBadVersion(firstVersion))
//                firstVersion -= interval;
//            else
//                firstVersion += interval;
//
//            if(isBadVersion(firstVersion) && !isBadVersion(firstVersion - 1))
//                return firstVersion;
//        }

        long first = 0;
        long last = n;
        long firstVersion = n/2;

        while(first < last) {
            firstVersion = (last + first)/2;
                if(isBadVersion(firstVersion)) {
                    last = firstVersion;
                } else {
                    first = firstVersion + 1;
                }
            }
        return (int)last;
    }
}
