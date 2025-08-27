package Yandex;

import java.util.Scanner;

public class LargeThanNeighbours {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        scan.close();

        String[] s = input.split(" ");
        int count = 0;

        for (int i = 1; i < s.length - 1; i++) {
            if((Integer.parseInt(s[i]) > Integer.parseInt(s[i-1])) && (Integer.parseInt(s[i]) > Integer.parseInt(s[i+1])))
                count++;
        }
        System.out.println(count);
    }
}
