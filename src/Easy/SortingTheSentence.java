package Easy;
//TASK.1859 Sorting the sentence

public class SortingTheSentence {
    public static void main(String[] args) {
        String s1 = "is2 sentence4 This1 a3";
        String s2 = "Myself2 Me1 I4 and3";

        System.out.println(s1);
        System.out.println(sortSentence(s1));
        System.out.println();
        System.out.println(s2);
        System.out.println(sortSentence(s2));
    }

    private static String sortSentence(String s) {
        String [] sentence = s.split(" ");

        String [] predResult = new String[sentence.length];

        for (int i = 0; i < sentence.length; i++) {
            int index = sentence[i].charAt(sentence[i].length() -1) - '0' - 1;
            String word = sentence[i].substring(0, sentence[i].length() - 1);

            predResult[index] = word;
        }


        StringBuilder result = new StringBuilder();

        for (int i = 0; i < sentence.length - 1; i++) {
            result.append(predResult[i] + " ");
        }
        result.append(predResult[sentence.length-1]);

        return result.toString();
    }
}
