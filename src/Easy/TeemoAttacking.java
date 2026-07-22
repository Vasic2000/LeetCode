package Easy;
//TASK.495. Teemo Attacking
//Our hero Teemo is attacking an enemy Ashe with poison attacks! When Teemo attacks Ashe, Ashe gets poisoned for a exactly duration seconds. More formally, an attack at second t will mean Ashe is poisoned during the inclusive time interval [t, t + duration - 1]. If Teemo attacks again before the poison effect ends, the timer for it is reset, and the poison effect will end duration seconds after the new attack.
//You are given a non-decreasing integer array timeSeries, where timeSeries[i] denotes that Teemo attacks Ashe at second timeSeries[i], and an integer duration.
//Return the total number of seconds that Ashe is poisoned.

public class TeemoAttacking {
    public static void main(String[] args) {
        int[] ts1 = {1,4};
        int[] ts2 = {1,2};
        int[] ts3 = {2,4,6,8,10,12};
        System.out.println(findPoisonedDuration(ts1, 2));
        System.out.println(findPoisonedDuration(ts2, 2));
        System.out.println(findPoisonedDuration(ts3, 3));
    }

    private static int findPoisonedDuration(int[] timeSeries, int duration) {
        int result = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] > timeSeries[i] + duration) {
                result += duration;
            } else {
                result += timeSeries[i + 1] - timeSeries[i];
            }
        }
        result += duration;
        return result;
    }
}
