//        TASK.2037
//        There are n availabe seats and n students standing in a room. You are given an array seats of length n, where seats[i] is the position of the ith seat. You are also given the array students of length n, where students[j] is the position of the jth student.
//        You may perform the following move any number of times:
//        Increase or decrease the position of the ith student by 1 (i.e., moving the ith student from position x to x + 1 or x - 1)
//        Return the minimum number of moves required to move each student to a seat such that no two students are in the same seat.
//        Note that there may be multiple seats or students in the same position at the beginning.

package Easy;

import java.util.Arrays;

public class MinimumMoviesToSeat {
    public static void main(String[] args) {
        int [] seats1 = {3,1,5};
        int [] students1 = {2,7,4};
        int [] seats2 = {4,1,5,9};
        int [] students2 = {1,3,2,6};
        int [] seats3 = {2,2,6,6};
        int [] students3 = {1,3,2,6};

        System.out.println(minMoviesToSeat(seats1, students1));
        System.out.println(minMoviesToSeat(seats2, students2));
        System.out.println(minMoviesToSeat(seats3, students3));
    }

    private static int minMoviesToSeat(int[] seats, int[] students) {
        int result = 0;
        Arrays.sort(seats);
        Arrays.sort(students);
        for (int i = 0; i < seats.length; i++) {
            result += Math.abs(students[i] - seats[i]);
        }
        return result;
    }
}
