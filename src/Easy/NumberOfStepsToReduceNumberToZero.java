package Easy;
//TASK.1342 Number Of Steps To Reduce a Number to Zero

public class NumberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(123));
    }

    private static int numberOfSteps(int num) {
        int steps = 0;
        while(num != 0) {
            if(num%2!=0) {
                num--;
            } else {
                num/=2;
            }
            steps++;
        }
        return steps;
    }
}
