package Easy;

public class Polindrome {
    public static void main(String[] args) {
        int inbox1 = 121;
        int inbox2 = 124;
        int inbox3 = 12121;
        int inbox4 = 322123;
        int inbox5 = 12321;

        System.out.println(isPalindrome(inbox1));
        System.out.println(isPalindrome(inbox2));
        System.out.println(isPalindrome(inbox3));
        System.out.println(isPalindrome(inbox4));
        System.out.println(isPalindrome(inbox5));
    }

    public static boolean isPalindrome(int x) {
        char[] polindrome = String.valueOf(x).toCharArray();
        int length = polindrome.length;
        for(int i = 0; i < polindrome.length; i++) {
            if(polindrome[i] != polindrome[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
