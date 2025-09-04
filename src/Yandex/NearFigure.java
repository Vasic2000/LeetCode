package Yandex;

//Напишите программу, которая находит в массиве элемент, самый близкий по величине к данному числу.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NearFigure {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        String[] k_String = reader.readLine().split(" ");
        int x = Integer.parseInt(reader.readLine());
        reader.close();

        int[] arra = new int[k_String.length];

        for (int i = 0; i < arra.length; i++) {
            arra[i] = Integer.parseInt(k_String[i]);
        }

        int minDist = Math.abs(x - arra[0]);
        int minDistIndex = 0;

        for (int i = 1; i < arra.length; i++) {
            if(Math.abs(x - arra[i]) < minDist) {
                minDist = Math.abs(x - arra[i]);
                minDistIndex = i;
            }
        }
        System.out.println(arra[minDistIndex]);
    }
}
