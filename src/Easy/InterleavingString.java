package Easy;

public class InterleavingString {

    public static void main(String[] args) {

        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        System.out.println(isInterleave(s1, s2, s3));

        String s4 = "aabcc";
        String s5 = "dbbca";
        String s6 = "aadbbbaccc";
        System.out.println(isInterleave(s4, s5, s6));

        String s7 = "";
        String s8 = "";
        String s9 = "";
        System.out.println(isInterleave(s7, s8, s9));

    }

    public static boolean isInterleave(String s1, String s2, String s3) {
        char [] string1 = s1.toCharArray();
        char [] string2 = s1.toCharArray();
        char [] string3 = s1.toCharArray();



        return false;
    }
}