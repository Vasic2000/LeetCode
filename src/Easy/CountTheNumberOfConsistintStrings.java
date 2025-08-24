package Easy;

//Task 1684

public class CountTheNumberOfConsistintStrings {
    public static void main(String[] args) {
        String [] words1 = {"ad","bd","aaab","baa","badab"};
        String [] words2 = {"a","b","c","ab","ac","bc","abc"};
        String [] words3 = {"cc","acd","b","ba","bac","bad","ac","d"};

        System.out.println(countConsistentStrings("ab", words1));
        System.out.println(countConsistentStrings("abc", words2));
        System.out.println(countConsistentStrings("cad", words3));
    }

    private static int countConsistentStrings(String allowed, String[] words) {
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(ifConsist(allowed, words[i])) {
                count++;
            }
        }
        return count;
    }

    private static boolean ifConsist(String allowed, String word) {
        char [] w = word.toCharArray();
        for (int i = 0; i < w.length; i++) {
            if (!allowed.contains(Character.toString(word.charAt(i)))) {
                return false;
            }
        }
        return true;
    }
}

