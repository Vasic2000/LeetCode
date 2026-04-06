package Easy;
//TASK.2185 Counting Words With a Given Perfix

public class CountingWordsWithAGivenPerfix {
    public static void main(String[] args) {
        String[] word1 = {"pay","attention","practice","attend"};
        String[] word2 = {"leetcode","win","loops","success"};
        String[] word3 = {"op","opra","oprerhaus","success","opr"};

        System.out.println(perfixCount(word1, "at"));
        System.out.println(perfixCount(word2, "code"));
        System.out.println(perfixCount(word3, "opr"));

    }

    private static int perfixCount(String[] words, String pref) {
        int prefLength = pref.length();
        int result = 0;
        String woorf;
        for(String word : words) {
            if(prefLength <= word.length()) {
                woorf = word.substring(0, prefLength);
                if (woorf.equals(pref)) {
                    result++;
                }
            }
        }
        return result;
    }
}
