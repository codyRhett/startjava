/*!
* \brief Класс калькулятор отвечает за проверку знака и мат.
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/

package com.startjava.lesson_2_3_4.game;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    
    private Player player1;
    private Player player2;

    public GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        Scanner scan = new Scanner(System.in);
        secretNumber = new Random().nextInt(100) + 1;

        // Счетчик числа попыток для первого игрока
        int cnt1 = 0;

        // Счетчик числа попыток для второго игрока
        int cnt2 = 0;
        while((cnt1 < 10) && (cnt2 < 10)) {
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            player1.setNumber(scan.nextInt(), cnt1);

            if (player1.getNumber(cnt1) < secretNumber) {
                System.out.println("Введенное число = " + player1.getNumber(cnt1) + " меньше загаданного ");
            } else if (player1.getNumber(cnt1) > secretNumber) {
                System.out.println("Введенное число = " + player1.getNumber(cnt1) + " больше загаданного ");
            } else if (player1.getNumber(cnt1) == secretNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber(cnt1) + " c " + (cnt1+1) + " попытки");
                System.out.print("Введенные числа: ");
                for (int i = 0; i < cnt1; i++) {
                    System.out.print(player1.getArray(cnt1)[i] + " ");
                }
                System.out.println();
                player1.fillZeroes(cnt2);
                return;
            }

            cnt1++;
            if (cnt1 > 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
                System.out.print("Введенные числа: ");
                for (int i = 0; i < cnt1; i++) {
                    System.out.print(player1.getArray(cnt1)[i] + " ");
                }
                System.out.println();
            }

            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            player2.setNumber(scan.nextInt(), cnt2);

            if (player2.getNumber(cnt2) < secretNumber) {
                System.out.println("Введенное число = " + player2.getNumber(cnt2) + " меньше загаданного ");
            } else if (player2.getNumber(cnt2) > secretNumber) {
                System.out.println("Введенное число = " + player2.getNumber(cnt2) + " больше загаданного ");
            } else if (player2.getNumber(cnt2) == secretNumber) {
                 System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber(cnt2) + " c " + (cnt2+1) + " попытки");
                 System.out.print("Введенные числа: ");
                 for (int i = 0; i < cnt2; i++) {
                     System.out.print(player2.getArray(cnt2)[i] + " ");
                 }
                 System.out.println();
                 player2.fillZeroes(cnt2);
                 return;
            }

            cnt2++;
            if (cnt2 > 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
                System.out.print("Введенные числа: ");
                for (int i = 0; i < cnt2; i++) {
                    System.out.print(player2.getArray(cnt2)[i] + " ");
                }
                System.out.println();
            }
        }
    }
}