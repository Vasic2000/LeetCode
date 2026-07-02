package Easy;
//TASK.3838 Weighted_Word_Mapping

public class WeightedWordMapping {
    public static void main(String[] args) {
        String[] words1 = {"abcd", "def", "xyz"};
        String[] words2 = {"a", "b", "c"};
        String[] words3 = {"abcd"};

        int[] weights1 = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        int[] weights2 = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
        int[] weights3 = {7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5};

        System.out.println(mapWordWeights(words1, weights1));
        System.out.println(mapWordWeights(words2, weights2));
        System.out.println(mapWordWeights(words3, weights3));
    }

    private static String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            result.append(resultCharFromWord(words[i], weights));
        }
        return result.toString();
    }

    private static char resultCharFromWord(String word, int[] weights) {
        int result = 0;
        for (int i = 0; i < word.length(); i++) {
            result += weightChar(word.charAt(i), weights);
        }
        return resultChar(result);
    }

    private static char resultChar(int result) {
        switch (result % 26) {
            case 0:
                return 'z';
            case 1:
                return 'y';
            case 2:
                return 'x';
            case 3:
                return 'w';
            case 4:
                return 'v';
            case 5:
                return 'u';
            case 6:
                return 't';
            case 7:
                return 's';
            case 8:
                return 'r';
            case 9:
                return 'q';
            case 10:
                return 'p';
            case 11:
                return 'o';
            case 12:
                return 'n';
            case 13:
                return 'm';
            case 14:
                return 'l';
            case 15:
                return 'k';
            case 16:
                return 'j';
            case 17:
                return 'i';
            case 18:
                return 'h';
            case 19:
                return 'g';
            case 20:
                return 'f';
            case 21:
                return 'e';
            case 22:
                return 'd';
            case 23:
                return 'c';
            case 24:
                return 'b';
            case 25:
                return 'a';
        }
        return '1';
    }

    private static int weightChar(char c, int[] weight) {
        switch (c) {
            case 'a':
                return weight[0];
            case 'b':
                return weight[1];
            case 'c':
                return weight[2];
            case 'd':
                return weight[3];
            case 'e':
                return weight[4];
            case 'f':
                return weight[5];
            case 'g':
                return weight[6];
            case 'h':
                return weight[7];
            case 'i':
                return weight[8];
            case 'j':
                return weight[9];
            case 'k':
                return weight[10];
            case 'l':
                return weight[11];
            case 'm':
                return weight[12];
            case 'n':
                return weight[13];
            case 'o':
                return weight[14];
            case 'p':
                return weight[15];
            case 'q':
                return weight[16];
            case 'r':
                return weight[17];
            case 's':
                return weight[18];
            case 't':
                return weight[19];
            case 'u':
                return weight[20];
            case 'v':
                return weight[21];
            case 'w':
                return weight[22];
            case 'x':
                return weight[23];
            case 'y':
                return weight[24];
            case 'z':
                return weight[25];
        }
        return -99999;
    }
}
