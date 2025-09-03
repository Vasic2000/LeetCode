package Yandex;

// Дан список. Определите, является ли он монотонно возрастающим (то есть верно ли, что каждый элемент этого списка строго больше предыдущего).
// Выведите YES, если массив монотонно возрастает и NO в противном случае.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IsArrayGrows {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] input = reader.readLine().split(" ");
        reader.close();

        System.out.println(isArrayGrows(input));
    }

    private static String isArrayGrows(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (Integer.parseInt(array[i]) >= Integer.parseInt(array[i + 1])) {
                return "NO";
            }
        }
        return "YES";
    }
}
