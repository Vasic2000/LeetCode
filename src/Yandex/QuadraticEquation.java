package Yandex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuadraticEquation {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String[] inputB = reader.readLine().split(" ");

        int a = Integer.parseInt(inputB[0]);
        int b = Integer.parseInt(inputB[1]);
        int c = Integer.parseInt(inputB[2]);

        int D = (b * b) - (4 * a * c);

        if (D < 0) {
            System.out.println("0");
        } else if (D == 0) {
            System.out.println("1");
            System.out.println((double) -b / (2 * a));
        } else {
            System.out.println("2");
            System.out.println((-b - Math.sqrt(D)) / (2 * a));
            System.out.println((-b + Math.sqrt(D)) / (2 * a));
        }
        reader.close();
    }
}

