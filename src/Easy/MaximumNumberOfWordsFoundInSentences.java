package Easy;
//TASK.2114 Maximum Number Of Words Found in Sentences

public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
        String[] sentences1 = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        String[] sentences2 = {"please wait", "continue to fight", "continue to win"};

        System.out.println(mostWordsFound(sentences1));
        System.out.println(mostWordsFound(sentences2));
    }

    private static int mostWordsFound(String[] sentences) {
        int result = 0;
        int promResult = 0;
        for(String sentc : sentences) {
            promResult = sentc.split(" ").length;
            if(promResult > result) {
                result = promResult;
            }
        }
        return result;
    }
}
