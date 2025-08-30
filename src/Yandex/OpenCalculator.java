package Yandex;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//Сначала вводятся три различных числа из диапазона от 0 до 9: x, y и z
// (числа разделяются пробелами).
// Далее вводится целое неотрицательное число N, которое Петя хочет ввести в калькулятор.
// Число N не превышает 10000.
//Выведите, какое минимальное количество кнопок должно быть добавлено для того,
// чтобы можно было ввести число N (если число может быть введено с помощью уже имеющихся кнопок, выведите 0)

public class OpenCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String [] buttons = scan.nextLine().split(" ");
        String [] number = scan.nextLine().split("");

        int countNew = 0;
        List newButtons = new ArrayList<>();
        boolean findB;

        for (int i = 0; i < number.length; i++) {
            findB = false;
            for (int j = 0; j < buttons.length; j++) {
                if(number[i].equals(buttons[j])) {
                    findB = true;
                }
                if(newButtons.contains(number[i])) {
                    findB = true;
                }
            }
            if(!findB) {
                countNew++;
                newButtons.add(number[i]);
            }
        }
        System.out.println(countNew);
    }
}
