package Easy;
//TASK.3794
//ReverseStringPerfix

public class ReverseStringPerfix {
    public static void main(String[] args) {
        System.out.println(reversePerfix("abcd",2));
        System.out.println(reversePerfix("xyz",3));
        System.out.println(reversePerfix("abcdef", 3));
        System.out.println(reversePerfix("hey",1));
    }

    private static String reversePerfix(String s, int k) {
        char[] stringArr = s.toCharArray();
        char[] result = new char[s.length()];

        for (int j = 0; j < k; j++) {
            result[j] = stringArr[k -1 -j];
        }

        for (int j = k; j < stringArr.length; j++) {
            result[j] = stringArr[j];
        }

        return String.valueOf(result);
    }
}
