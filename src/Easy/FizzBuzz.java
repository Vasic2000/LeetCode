package Easy;
//TASK.412

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        printStringArrayList(fizzBuzz(3));
        printStringArrayList(fizzBuzz(5));
        printStringArrayList(fizzBuzz(15));
        printStringArrayList(fizzBuzz(30));
    }

    private static void printStringArrayList(List<String> strings) {
        for (int i = 0; i < strings.size() - 1; i++) {
            System.out.print(strings.get(i) + ";");
        }
        System.out.println(strings.get(strings.size()-1));
    }

    private static List<String> fizzBuzz(int i) {
        List<String> result = new ArrayList<>();
        for (int j = 1; j < i + 1; j++) {
            if((j%3 == 0) && (j%5 == 0)) {
                result.add("FizzBuzz");
            } else if(j%3 == 0) {
                result.add("Fizz");
            } else if (j%5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(j));
            }
        }
        return result;
    }
}
