package Easy;
//TASK2000. Reverse Prefix of Word

public class ReversPerfixOfWord {
    public static void main(String[] args) {
        System.out.println(reversePerfix2("abcdefd", 'd'));
        System.out.println(reversePerfix2("xyxzxe", 'z'));
        System.out.println(reversePerfix2("abcd", 'z'));

    }

    private static String reversePerfix2(String word, char ch) {
        char[] stringArr = word.toCharArray();
        int index = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if(stringArr[i] == ch) {
                index = i;
                i = stringArr.length;
            }
        }

        if(index!=0) {
            StringBuilder result = new StringBuilder();
            for (int i = index; i >=0 ; i--) {
                result.append(stringArr[i]);
            }
            for (int i = index + 1; i < stringArr.length ; i++) {
                result.append(stringArr[i]);
            }
            return result.toString();
        }
        return word;
    }
}
