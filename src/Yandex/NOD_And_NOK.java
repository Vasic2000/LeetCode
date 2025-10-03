package Yandex;
//Даны 2 натуральных числа A и B
//Необходимо посчитать НОД(a, b) и НОК(a, b).

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NOD_And_NOK {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] AandB;
        AandB = reader.readLine().split(" ");
        int A = Integer.parseInt(AandB[0]); // Число А
        int B = Integer.parseInt(AandB[1]); // Число Б

        System.out.println(NOD(A,B) + " " + NOK(A,B));

        reader.close();
    }

    private static int NOD(int a, int b) {
        // Алгоритм Евклида
        while ((a > 0) && (b > 0)) {
            if(a >= b)
                a = a % b;
            else
                b = b % a;
        }
        return Math.max(a,b);
    }

    private static long NOK(int a, int b) {
        return (long)a * (long)b/NOD(a,b);
    }
}
