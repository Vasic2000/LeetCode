package Easy;

public class reverseString2 {
    public static void main(String[] args) {
        String s1 = "abcdefg";
        String s2 = "abcd";
        String s3 = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(s1);
        System.out.println(reverseStr(s1,2));

        System.out.println(s2);
        System.out.println(reverseStr(s2,2));

        System.out.println(s3);
        System.out.println(reverseStr(s3,5));
    }

    public static String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        StringBuilder temp;

        int i = 0;
        while (s.length() >= k * (i + 1)) {
            temp = new StringBuilder(s.substring(k * i, k * (i + 1)));
            if ((i + 1) % 2 != 0) temp.reverse();
            result.append(temp);
            i++;
        }
        temp = new StringBuilder(s.substring(k * i ));
        if ((i + 1) % 2 != 0) temp.reverse();

        if(s.length() < k) {
            temp = new StringBuilder(s);
            temp.reverse();
        }

        result.append(temp);
        return result.toString();
    }
}
