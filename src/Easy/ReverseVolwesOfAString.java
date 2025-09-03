package Easy;
//        LeetCode 75
//        345. Reverse Vowels of a String

public class ReverseVolwesOfAString {
    public static void main(String[] args) {
        System.out.println("ABBI -> " + reverseVowels("ABBI"));
        System.out.println("IceCreAm -> " + reverseVowels("IceCreAm"));
        System.out.println("leetcode -> " + reverseVowels("leetcode"));
        System.out.println("oi -> " + reverseVowels("oi"));
        System.out.println("i -> " + reverseVowels("i"));
        System.out.println("cd -> " + reverseVowels("cd"));
        System.out.println("ica -> " + reverseVowels("ica"));
        System.out.println("dic -> " + reverseVowels("dic"));
        System.out.println("Euston saw I was not Sue. -> " + reverseVowels("Euston saw I was not Sue."));
    }

    private static String reverseVowels(String s) {
        char[] str = s.toCharArray();
        char temp;
        int left = 0;
        int right = str.length - 1;

        while (right > left) {
            // Ищу первую гласную слева
            while((str[left] != 97) && (str[left] != 101) && (str[left] != 105) && (str[left] != 111) && (str[left] != 117) && (str[left] != 65) && (str[left] != 69) && (str[left] != 73) && (str[left] != 79) && (str[left] != 85) && (left != right)) {
                left++;
            }
            // Ищу первую гласную справа
            while((str[right] != 97) && (str[right] != 101) && (str[right] != 105) && (str[right] != 111) && (str[right] != 117) && (str[right] != 65) && (str[right] != 69) && (str[right] != 73) && (str[right] != 79) && (str[right] != 85) && (left != right)) {
                right--;
            }
            // Меняю местами
            if (right > left) {
                temp = str[right];
                str[right] = str[left];
                str[left] = temp;
                left++;
                right--;
            }
        }
        return new String(str);
    }
}
