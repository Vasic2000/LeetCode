package Easy;

public class ReverseString {
    public static void main(String[] args) {
        char [] string1 = "Hellow".toCharArray();
        char [] string2 = "Was it a car or a cat I saw?".toCharArray();
        char [] string3 = "".toCharArray();

        reverseString(string1);
        reverseString(string2);
        reverseString(string3);

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
    }

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length -1;
        char temp;
        while(left < right) {
            temp = s[right];
            s[right] = s[left];
            s[left] = temp;
            left++;
            right--;
        }
    }
}
