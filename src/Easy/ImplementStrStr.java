package Easy;

public class ImplementStrStr {
    public static void main(String[] args) {
        System.out.println(strStr("hello", "ll"));
        System.out.println(strStr("fonastill", "ll"));
        System.out.println(strStr("fonastill", "hh"));
    }

    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

}
