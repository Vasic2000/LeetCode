package Easy;


public class IsPalindrome {
    public static void main(String[] args) {
//        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(isPalindrome("race a car"));
//        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));
    }

    private static boolean isPalindrome(String s) {
        StringBuilder clearString = new StringBuilder();

        char[] palindrome = s.toCharArray();
        for(int i = 0; i < palindrome.length; i++) {
            if((palindrome[i] > 96) && (palindrome[i] < 123))
                clearString.append(palindrome[i]);
            if((palindrome[i] > 64) && (palindrome[i] < 91))
                clearString.append((char)(palindrome[i] + 32));
            if((palindrome[i] > 47) && (palindrome[i] < 58))
                clearString.append(palindrome[i]);

        }

        char[] clearPalindrome = clearString.toString().toCharArray();
        for(int i = 0; i < clearPalindrome.length / 2; i++) {
            if(clearPalindrome[i] != clearPalindrome[clearPalindrome.length - i -1])
                return false;
        }

        return true;
    }


}
