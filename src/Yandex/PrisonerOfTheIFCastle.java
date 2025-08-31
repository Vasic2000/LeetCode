package Yandex;
//Узник замка Иф
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrisonerOfTheIFCastle {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int sideA = Integer.parseInt(reader.readLine());
        int sideB = Integer.parseInt(reader.readLine());
        int sideC = Integer.parseInt(reader.readLine());
        int sideD = Integer.parseInt(reader.readLine());
        int sideE = Integer.parseInt(reader.readLine());
        reader.close();

        System.out.println(canI(sideA, sideB, sideC, sideD, sideE));
    }

    private static String canI(int sideA, int sideB, int sideC, int sideD, int sideE) {
        int minBrickSide, brick2side, minHoleSide, maxHoleSide;

        if(sideD > sideE) {
            minHoleSide = sideE;
            maxHoleSide = sideD;
        } else {
            minHoleSide = sideD;
            maxHoleSide = sideE;
        }

        if((sideA <= sideB) && (sideA <= sideC)) {
            minBrickSide = sideA;
            if(sideB <= sideC) {
                brick2side = sideB;
            } else {
                brick2side = sideC;
            }
        } else if((sideB <= sideA) && (sideB <= sideC)) {
            minBrickSide = sideB;
            if(sideA <= sideC) {
                brick2side = sideA;
            } else {
                brick2side = sideC;
            }
        } else  {
            minBrickSide = sideC;
            if(sideA <= sideB) {
                brick2side = sideA;
            } else {
                brick2side = sideB;
            }
        }

        if((minHoleSide >= minBrickSide) && (maxHoleSide >= brick2side))
            return "YES";
        return "NO";
    }
}
