package Easy;
//TASK.1816

public class TruncateSentence {
    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant", 4));
        System.out.println(truncateSentence("What is the solution to this problem", 4));
        System.out.println(truncateSentence("chopper is not a tanuki", 5));
    }

    private static String truncateSentence(String s, int k) {
        StringBuilder result = new StringBuilder();
        String[] array = s.split(" ");

        for (int i = 0; i < k-1; i++) {
            result.append(array[i] + " ");
        }
        result.append(array[k - 1]);
        return result.toString();
    }
}
