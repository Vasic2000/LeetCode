package Easy;
//TASK.1662

public class CheckIfTwoStringArraysAreEquivalent {
    public static void main(String[] args) {
        String [] word1 = {"ab", "c"};
        String [] word2 = {"a", "bc"};

        String [] word3 = {"a", "cb"};
        String [] word4 = {"ab", "c"};

        String [] word5 = {"abc", "d", "defg"};
        String [] word6 = {"abcddefg"};

        printArrStr(word1);
        System.out.print(" + ");
        printArrStr(word2);
        System.out.println(" are " + arrayStringsAreEqual(word1, word2));

        printArrStr(word3);
        System.out.print(" + ");
        printArrStr(word4);
        System.out.println(" are " + arrayStringsAreEqual(word3, word4));

        printArrStr(word5);
        System.out.print(" + ");
        printArrStr(word6);
        System.out.println(" are " + arrayStringsAreEqual(word5, word6));
    }

    private static void printArrStr(String[] word) {
        System.out.print("{");
        for (int i = 0; i < word.length-1; i++) {
            System.out.print(word[i] + ",");
        }
        System.out.print(word[word.length - 1] + "}");
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder worder1 = new StringBuilder();
        StringBuilder worder2 = new StringBuilder();

        for (int i = 0; i < word1.length; i++) {
            worder1.append(word1[i]);
        }

        for (int i = 0; i < word2.length; i++) {
            worder2.append(word2[i]);
        }

        if(worder1.toString().equals(worder2.toString()))
            return true;
        else
            return false;
    }
}
