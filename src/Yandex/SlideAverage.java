package Yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SlideAverage {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = Integer.parseInt(reader.readLine());
            List<Integer> numbers = readList(reader);
            int k = Integer.parseInt(reader.readLine());
            printNewArray(n, numbers, k);
        }
    }

    private static void printNewArray(int n, List<Integer> numbers, int k) {
        double current_sum = 0;

        // Первый раз вычисляем значение честно и сохраняем результат.
        for (int i = 0; i < k; i++) {
            current_sum = current_sum + numbers.get(i);
        }
        System.out.print(current_sum / k);

        // Цикл до последнего
        for (int i = 0; i < numbers.size() - k; i++) {
            current_sum -= numbers.get(i);
            current_sum += numbers.get(i + k);
            System.out.print(" " + current_sum / k);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return Arrays.asList(reader.readLine().strip().split(" "))
                .stream()
                .map(token -> Integer.parseInt(token))
                .collect(Collectors.toList());
    }
}
