package Yandex;

import java.io.*;
import java.util.Scanner;

public class JuliyaNikitanTasks {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        String[] s = input.split(" ");
        long output = Long.parseLong(s[0]) + Long.parseLong(s[1]);
//        int output = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
        System.out.println(output);


//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String input = reader.readLine();
//        String[] s = input.split(" ");
//
//        int output = Integer.parseInt(s[0]) + Integer.parseInt(s[1]);
//      /*
//        Пример ввода и вывода числа n, где -10^9 < n < 10^9:
//        int n = Integer.parseInt(reader.readLine());
//        writer.write(String.valueOf(n));
//        */
//        System.out.println(output);
//
//        reader.close();
//        writer.close();


    }
}
