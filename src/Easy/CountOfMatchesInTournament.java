package Easy;
//TASK.1618
//Return the number of matches played in the tournament until a winner is decided.

public class CountOfMatchesInTournament {
    public static void main(String[] args) {
        System.out.println(countOfMatches(7));
        System.out.println(countOfMatches(14));
        System.out.println(countOfMatches(119));
    }

    private static int countOfMatches(int n) {
        int result = 0;
        while(n > 1) {
            if(n%2 != 0) {
                n=n/2 +1;
                result += n - 1;
            } else {
                n = n/2;
                result +=n;
            }
        }
        return result;
    }
}
