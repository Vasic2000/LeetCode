package Easy;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.println("5 -> " + smallestEvenMultiple(5));
        System.out.println("6 -> " + smallestEvenMultiple(6));
        System.out.println("7 -> " + smallestEvenMultiple(7));
        System.out.println("22- >" + smallestEvenMultiple(22));
        System.out.println("21-> " + smallestEvenMultiple(21));
    }

    private static int smallestEvenMultiple(int n) {
        if(n%2==0)return n;
        else return n*2;
    }
}
