package Easy;

public class FindTheMaxAchievableNumber {

    public static void main(String[] args) {
        System.out.println(theMaximumAchievableX(10, 15));
        System.out.println(theMaximumAchievableX(4, 1));
        System.out.println(theMaximumAchievableX(3, 2));
    }
    public static int theMaximumAchievableX(int num, int t) {
        return num + t * 2;
    }
}
