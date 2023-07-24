package Yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zipper {

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(reader);
            List<Integer> numbers1 = readList(reader);
            List<Integer> numbers2 = readList(reader);
            printNewArray(n, numbers1, numbers2);
        }
    }

    private static List<Integer> readList(BufferedReader reader) throws IOException {
        return Arrays.asList(reader.readLine().strip().split(" "))
                .stream()
                .map(token -> Integer.parseInt(token))
                .collect(Collectors.toList());
    }

    private static int readInt(BufferedReader reader) throws NumberFormatException, IOException {
        return Integer.parseInt(reader.readLine());
    }

    public static void printNewArray(int n, List<Integer> numbers1, List<Integer> numbers2) {
        for(int i = 0; i < n - 1; i++) {
            System.out.print((numbers1.get(i) + " "));
            System.out.print((numbers2.get(i) + " "));
        }
        System.out.print(numbers1.get(n - 1) + " ");
        System.out.println(numbers2.get(n - 1));
    }
}
