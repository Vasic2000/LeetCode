package Easy;
//TASK.414

public class ThirdMaximumNumber {
    public static void main(String[] args) {
        int[] num1 = {3,11,5,4,7,88,9,12,6,2,1};
        int[] num2 = {3,2,1};
        int[] num3 = {1,2};
        int[] num4 = {2,2,3,1};
        int[] num5 = {-491,-492,-399,-120,- 311};
        int[] num6 = {21,21,21,21,21,21,21,21,21,21,21};

        System.out.println(thirdMax(num1));
        System.out.println(thirdMax(num2));
        System.out.println(thirdMax(num3));
        System.out.println(thirdMax(num4));
        System.out.println(thirdMax(num5));
        System.out.println(thirdMax(num6));
    }

    private static int thirdMax(int[] num) {
        int max1, max2, max3;
        int min;

        //Find min to remove maximum1
        min = num[0];
        for (int i = 0; i < num.length; i++) {
            if(min > num[i])
                min = num[i];
        }

        //The first walk, find max1
        max1 = num[0];
        for (int i = 0; i < num.length; i++) {
            if(max1 < num[i])
                max1 = num[i];
        }

        //If all digits the same
        if(max1==min) {
            return max1;
        }

        //The second walk, remove max1
        for (int i = 0; i < num.length; i++) {
            if(max1 == num[i])
                num[i] = min;
        }

        //The third walk, find max2
        max2 = num[0];
        for (int i = 0; i < num.length; i++) {
            if(max2 < num[i])
                max2 = num[i];
        }

        //If max2 == min, and no max3
        if(max2==min) {
            return max1;
        }

        //The fourth walk, remove max2
        for (int i = 0; i < num.length; i++) {
            if(max2 == num[i])
                num[i] = min;
        }

        //The fifth walk, find max3
        max3 = num[0];
        for (int i = 0; i < num.length; i++) {
            if(max3 < num[i])
                max3 = num[i];
        }
        return max3;
    }
}
