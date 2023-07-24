import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TwoChips {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            List<Integer> numbers = readList(reader);
            int k = Integer.parseInt(reader.readLine());
            System.out.println(printAnswer(n, numbers, k));
        }
    }

    private static String printAnswer(int n, List<Integer> numbers, int k) {
        for (int i = 0; i < n - 1; i++)
            for (int j = i + 1; j < n; j++) {
                if(numbers.get(i) + numbers.get(j) == k) {
                    return numbers.get(i) + " " + numbers.get(j);
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
