package Easy;

public class FinalValueAfterOperations {
    public static void main(String[] args) {
        String[] operations1 = {"--X","X++","X++"};
        String[] operations2 = {"++X","++X","X++"};
        String[] operations3 = {"X++","++X","X--","--X"};
        String[] operations4 = {"X--","--X","X--","--X", "--"};

        System.out.println(finalValueAfterOperations(operations1));
        System.out.println(finalValueAfterOperations(operations2));
        System.out.println(finalValueAfterOperations(operations3));
        System.out.println(finalValueAfterOperations(operations4));
    }

    public static int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String element : operations) {
            switch (element) {
                case "--X":
                    --x;
                    break;
                case "++X":
                    ++x;
                    break;
                case "X--":
                    --x;
                    break;
                case "X++":
                    ++x;
                    break;
            }
        }
        return x;
    }
}
