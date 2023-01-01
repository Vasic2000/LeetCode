package Easy;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
        String string1 = "Let's take LeetCode contest";
        String string2 = "God Ding";
        String string3 = "";

        System.out.println(reverseWords(string1));
        System.out.println(reverseWords(string2));
        System.out.println(reverseWords(string3));
    }


    public static String reverseWords(String s) {
        StringBuilder result = new StringBuilder();

        String[] stringArr = s.split(" ");

        for (String word : stringArr) {
            char[] wordChar = word.toCharArray();
            int left = 0;
            int right = wordChar.length - 1;
            char temp;
            while (left < right) {
                temp = wordChar[right];
                wordChar[right] = wordChar[left];
                wordChar[left] = temp;
                left++;
                right--;
            }
            result.append(' ');
            result.append(wordChar);
        }
        result.delete(0,1);
        return result.toString();
//        return result.toString().trim();
    }
}