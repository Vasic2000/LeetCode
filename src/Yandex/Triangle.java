package Yandex;

import java.io.*;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String result;
        long sideA = Long.parseLong(reader.readLine());
        long sideB = Long.parseLong(reader.readLine());
        long sideC = Long.parseLong(reader.readLine());

        result = "YES";

        if (sideA == 0 || sideB == 0 || sideC == 0) result = "NO";
        if (sideA >= sideB + sideC) result = "NO";
        if (sideB >= sideA + sideC) result = "NO";
        if (sideC >= sideA + sideB) result = "NO";
        writer.write(result);
        reader.close();
        writer.close();
    }
}