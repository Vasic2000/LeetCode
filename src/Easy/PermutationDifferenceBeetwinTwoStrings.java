package Easy;
//TASK.3146

public class PermutationDifferenceBeetwinTwoStrings {
    public static void main(String[] args) {
        System.out.println("abc + bac -> " + findPermutationDifference("abc", "bac"));
        System.out.println("abcde + edbac -> " + findPermutationDifference("abcde", "edbac"));
    }

    public static int findPermutationDifference(String s, String t) {
        char st;
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            st = s.charAt(i);
            for (int j = 0; j < t.length(); j++) {
                if(st == t.charAt(j)) {
                    result = result + Math.abs(i - j);
                }
            }
        }
        return result;
    }
}
