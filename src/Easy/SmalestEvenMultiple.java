package Easy;
//TASK.2413
//Example 1:
//Input: n = 5
//Output: 10
//Explanation: The smallest multiple of both 5 and 2 is 10.
//
//Example 2:
//Input: n = 6
//Output: 6
//Explanation: The smallest multiple of both 6 and 2 is 6. Note that a number is a multiple of itself.

public class SmalestEvenMultiple {
    public static void main(String[] args) {
        System.out.println(smalestEvenMultipe(5));
        System.out.println(smalestEvenMultipe(6));
        System.out.println(smalestEvenMultipe(11));
        System.out.println(smalestEvenMultipe(3));
        System.out.println(smalestEvenMultipe(8));
        System.out.println(smalestEvenMultipe(12));
    }

    private static int smalestEvenMultipe(int n) {
        if(n%2==0)
            return n;
        else
            return n*2;
    }
}
