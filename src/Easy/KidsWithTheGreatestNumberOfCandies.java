package Easy;

import java.util.ArrayList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[]args){
        int[] candies1 = {2,3,5,1,3};
        int[] candies2 = {4,2,1,1,2};
        int[] candies3 = {12,1,12};

        System.out.println(kidsWithCandies(candies1, 3));
        System.out.println(kidsWithCandies(candies2, 1));
        System.out.println(kidsWithCandies(candies3, 10));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxPower = 0;
        for(int i = 0; i < candies.length; i++) {
            if(candies[i] > maxPower) {
                maxPower = candies[i];
            }
        }

        List<Boolean> result = new ArrayList<>();

        for(int i = 0; i < candies.length; i++) {
            if(candies[i] + extraCandies >= maxPower) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }
}
