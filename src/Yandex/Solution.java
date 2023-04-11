package Yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static long getCardCount(int n, int k, List<Long> cards) {
        long sum = 0;
        long[] keys1 = new long[k];
        long[] keys2 = new long[k];

        for (int i = 0; i < k; i++) {
            keys1[i] = cards.get(i);
            keys2[i] = cards.get(n - i - 1);
        }

        for (int variant = 0; variant < k; variant++) {
            long tempSum = 0;
            for (int i = 0; i < (k - variant); i++) {
                tempSum = tempSum + cards.get(i);
            }
            for (int i = n - 1; i > (n - 1 - variant); i--) {
                tempSum = tempSum + cards.get(i);
            }
            sum = Math.max(tempSum, sum);
        }


        return sum;
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            int n = readInt(reader);
            int k = readInt(reader);
            List<Long> cards = readList(reader);

            System.out.println(getCardCount(n, k, cards));
        }
    }

    private static List<Long> readList(BufferedReader reader) throws IOException {
        List<Long> list = new ArrayList<>();
        for (String s : reader.readLine().split(" ")) {
            list.add(Long.parseLong(s));
        }
        return list;
    }

    private static int readInt(BufferedReader reader) throws NumberFormatException, IOException {
        return Integer.parseInt(reader.readLine());
    }
}