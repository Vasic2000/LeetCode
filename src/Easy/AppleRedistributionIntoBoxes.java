package Easy;
//Task.3074 Apple Redistribution into Boxes

public class AppleRedistributionIntoBoxes {
    public static void main(String[] args) {
        int[] apple1 = {1,3,2};
        int[] capacity1 = {4,3,1,5,2};

        int[] apple2 = {5,5,5};
        int[] capacity2 = {2,4,2,7};

        System.out.println(minimumBoxes(apple1, capacity1));
        System.out.println(minimumBoxes(apple2, capacity2));
    }

    public static int minimumBoxes(int[] apple, int[] capacity) {
        capacity = sorting(capacity);

        int appleQuant = summOf(apple);
        int cargo = 0;
        int count = 0;

        while(cargo < appleQuant) {
            cargo += capacity[count];
            count++;
        }

        return count;
    }

    private static int summOf(int[] apple) {
        int result = 0;
        for (int i = 0; i < apple.length; i++) {
            result += apple[i];
        }
        return result;
    }

    private static int[] sorting(int[] capacity) {
        int temp;
        for (int i = 0; i < capacity.length - 1; i++) {
            for (int j = 0; j < capacity.length - 1; j++) {
                if(capacity[j] < capacity[j+1]) {
                    temp = capacity[j];
                    capacity[j] = capacity[j+1];
                    capacity[j+1] = temp;
                }
            }
        }
        return capacity;
    }
}
