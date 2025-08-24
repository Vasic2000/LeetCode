package Easy;

public class MergeStringsAlternately {

    public static void main(String[] args) {
        System.out.println("abc + " + "pqr = " + mergeAlternately("abc", "pqr"));
        System.out.println("ab + " + "pqrs = " + mergeAlternately("ab", "pqrs"));
        System.out.println("abcd + " + "pq = " + mergeAlternately("abcd", "pq"));
        System.out.println("itsayearsacaresa + " + "p = " + mergeAlternately("itsayearsacaresa", "p"));

    }

    public static String mergeAlternately(String word1, String word2) {
        char[] w1 = word1.toCharArray();
        char[] w2 = word2.toCharArray();

        StringBuilder result = new StringBuilder();

        int l1 = w1.length;
        int l2 = w2.length;
        int i = 0;
        while((i < l1) || (i < l2)) {
            if (i < l1) result.append(w1[i]);
            if (i < l2) result.append(w2[i]);
            i++;
        }
        return result.toString();
    }
}
