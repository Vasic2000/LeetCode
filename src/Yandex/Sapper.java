package Yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sapper {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] pline;
        pline = reader.readLine().split(" ");
        int N = Integer.parseInt(pline[0]); // Количество строк
        int M = Integer.parseInt(pline[1]); // Количество столбцов
        int K = Integer.parseInt(pline[2]); // Количество мин

        int[][] mineField = new int[K][K]; // Координаты мин

        // Заполняю поле с минами
        for (int i = 0; i < K; i++) {
            pline = reader.readLine().split(" ");
            mineField[Integer.parseInt(pline[0]) - 1][Integer.parseInt(pline[1]) - 1] = 9;
        }
        reader.close();

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mineField[i][j] = checkNeghbours(i, j, mineField);
            }
        }

        printField(mineField);
    }

    private static int checkNeghbours(int i, int j, int[][] mineField) {
        int neighbours = 0;

        if (i > 0) {  // Проверка строчки над искомой на мины
            if (j > 0) {
                if (mineField[i - 1][j - 1] == 9)
                    neighbours++;
            }

            if (mineField[i - 1][j] == 9)
                neighbours++;

            if (j < mineField.length) {
                if (mineField[i - 1][j + 1] == 9)
                    neighbours++;
            }
        }

        // Проверка текущей строчки на соседние мины
        if (j > 0) {
            if (mineField[i][j - 1] == 9)
                neighbours++;
        }

        if (j < mineField.length) {
            if (mineField[i][j + 1] == 9)
                neighbours++;
        }

        if (i < mineField.length - 1) {  // Проверка строчки под искомой на мины
            if (j > 0) {
                if (mineField[i + 1][j - 1] == 9)
                    neighbours++;
            }

            if (mineField[i + 1][j] == 9)
                neighbours++;

            if (j < mineField.length) {
                if (mineField[i + 1][j + 1] == 9)
                    neighbours++;
            }
        }
        return neighbours;
    }

    private static void printField(int[][] mineField) {
    }
}
