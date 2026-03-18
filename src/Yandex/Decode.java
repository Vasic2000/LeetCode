package Yandex;
//https://new.contest.yandex.ru/contests/89606/problems?id=30404%2F2026_02_06%2F1U5A7PMMJk

import java.io.*;

public class Decode {
    public static void main(String[] args) {
//        System.out.println(decoder("1212#"));
//        System.out.println(decoder("8512#12#15#"));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = null;
        try {
            s = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(decoder(s));

    }

    private static String decoder(String s) {
        String[] str = s.split("");
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < str.length) {
            if ((i < str.length - 2) && !(str[i + 2].equals("#"))) {
                switch (str[i]) {
                    case "1":
                        result.append("a");
                        i++;
                        break;
                    case "2":
                        result.append("b");
                        i++;
                        break;
                    case "3":
                        result.append("c");
                        i++;
                        break;
                    case "4":
                        result.append("d");
                        i++;
                        break;
                    case "5":
                        result.append("e");
                        i++;
                        break;
                    case "6":
                        result.append("f");
                        i++;
                        break;
                    case "7":
                        result.append("g");
                        i++;
                        break;
                    case "8":
                        result.append("h");
                        i++;
                        break;
                    case "9":
                        result.append("i");
                        i++;
                        break;
                }
            } else {
                switch (str[i]) {
                    case "1": {
                        switch (str[i + 1]) {
                            case "0":
                                result.append("j");
                                i = i + 3;
                                break;
                            case "1":
                                result.append("k");
                                i = i + 3;
                                break;
                            case "2":
                                result.append("l");
                                i = i + 3;
                                break;
                            case "3":
                                result.append("m");
                                i = i + 3;
                                break;
                            case "4":
                                result.append("n");
                                i = i + 3;
                                break;
                            case "5":
                                result.append("o");
                                i = i + 3;
                                break;
                            case "6":
                                result.append("p");
                                i = i + 3;
                                break;
                            case "7":
                                result.append("q");
                                i = i + 3;
                                break;
                            case "8":
                                result.append("r");
                                i = i + 3;
                                break;
                            case "9":
                                result.append("s");
                                i = i + 3;
                                break;
                        }
                        break;
                    }
                    case "2": {
                        switch (str[i + 1]) {
                            case "0":
                                result.append("t");
                                i = i + 3;
                                break;
                            case "1":
                                result.append("u");
                                i = i + 3;
                                break;
                            case "2":
                                result.append("v");
                                i = i + 3;
                                break;
                            case "3":
                                result.append("w");
                                i = i + 3;
                                break;
                            case "4":
                                result.append("x");
                                i = i + 3;
                                break;
                            case "5":
                                result.append("y");
                                i = i + 3;
                                break;
                            case "6":
                                result.append("z");
                                i = i + 3;
                                break;
                        }
                        break;
                    }
                }
            }
        }
        return result.toString();
    }
}