import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

public class TwoChips2 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            List<Integer> numbers = readList(reader);
            int k = Integer.parseInt(reader.readLine());
            System.out.println(printAnswer(n, numbers, k));
        }
    }

    private static String printAnswer(int n, List<Integer> numbers, int k) {
        sort(numbers);
        int left = 0;
        int right = n-1;
        while(right > left) {
            if(numbers.get(left) + numbers.get(right) == k) {
                return numbers.get(left) + " " + numbers.get(right);
            }    else if(numbers.get(left) + numbers.get(right) > k) {
                --right;
            }          else {
                ++left;
            }
        }
        return "None";
    }


    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return Arrays.asList(reader.readLine().strip().split(" "))
                .stream()
                .map(token -> Integer.parseInt(token))
                .collect(Collectors.toList());
    }
}