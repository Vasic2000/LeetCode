package Yandex;

import java.io.*;

public class TagsSetting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int output, pi_2, pi_1, pi;

        int input = Integer.parseInt(reader.readLine());

        if(input == 1) {
            output = 1;
        } else if(input == 2) {
            output = 2;
        } else {
            output = 2;
            pi_2 = 1;
            pi_1 = 1;
            for (int i = 2; i < input; i++) {
                pi = pi_2 + pi_1;
                pi_2 = pi_1;
                pi_1 = pi;
                output = output + pi;
            }
        }

        writer.write(String.valueOf(output));

        reader.close();
        writer.close();
    }
}
