package Easy;

public class Length_of_Last_Word {
    public static void main(String[] args) {
        printAnswer("Hello World");
        printAnswer("   fly me   to   the moon  ");
        printAnswer("luffy is still joyboy");
    }

    private static void printAnswer(String s) {
        String word = lastWorld(s);
        int length = lengthOfLastWord(s);
        System.out.println("The last word is " + word + " with length " + length +".");
    }

    private static String lastWorld(String s) {
        char [] string = s.toCharArray();
        int start = 0;
        int end = string.length;
        for(int i = s.length() - 1; i > 0; i--) {
            if((string[i] == ' ') && (end == i + 1)) {
                end = i;
            }
        }
        for(int i = 0; i < end; i++) {
            if(string[i] == ' ') {
                start = i + 1;
            }
        }

        return s.substring(start, end);
    }

    public static int lengthOfLastWord(String s) {
        char [] string = s.toCharArray();
        int start = 0;
        int end = string.length;
        for(int i = s.length() - 1; i > 0; i--) {
            if((string[i] == ' ') && (end == i + 1)) {
                end = i;
            }
        }
        for(int i = 0; i < end; i++) {
            if(string[i] == ' ') {
                start = i + 1;
            }
        }
        return end - start;
    }
}
