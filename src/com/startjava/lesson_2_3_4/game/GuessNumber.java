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

        player1.fillZeroes();
        player2.fillZeroes();

        while((player1.getTryCnt() < 10) && (player2.getTryCnt() < 10)) {
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            player1.setNumber(scan.nextInt());

            if (player1.getNumber() < secretNumber) {
                System.out.println("Введенное число = " + player1.getNumber() + " меньше загаданного ");
            } else if (player1.getNumber() > secretNumber) {
                System.out.println("Введенное число = " + player1.getNumber() + " больше загаданного ");
            } else if (player1.getNumber() == secretNumber) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " c " + (player1.getTryCnt()+1) + " попытки");
                System.out.print("Введенные числа: ");
                for (int i = 0; i < player1.getTryCnt(); i++) {
                    System.out.print(player1.getArray()[i] + " ");
                }
                System.out.println();
                return;
            }

            player1.incrTryCnt();

            if (player1.getTryCnt() > 9) {
                System.out.println("У игрока " + player1.getName() + " закончились попытки");
                System.out.print("Введенные числа: ");
                for (int i = 0; i < player1.getTryCnt(); i++) {
                    System.out.print(player1.getArray()[i] + " ");
                }
                System.out.println();
            }

            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            player2.setNumber(scan.nextInt());

            if (player2.getNumber() < secretNumber) {
                System.out.println("Введенное число = " + player2.getNumber() + " меньше загаданного ");
            } else if (player2.getNumber() > secretNumber) {
                System.out.println("Введенное число = " + player2.getNumber() + " больше загаданного ");
            } else if (player2.getNumber() == secretNumber) {
                 System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() + " c " + (player2.getTryCnt()+1) + " попытки");
                 System.out.print("Введенные числа: ");
                 for (int i = 0; i < player2.getTryCnt(); i++) {
                     System.out.print(player2.getArray()[i] + " ");
                 }
                 System.out.println();
                 return;
            }

            player2.incrTryCnt();

            if (player2.getTryCnt() > 9) {
                System.out.println("У игрока " + player2.getName() + " закончились попытки");
                System.out.print("Введенные числа: ");
                for (int i = 0; i < player2.getTryCnt(); i++) {
                    System.out.print(player2.getArray()[i] + " ");
                }
                System.out.println();
            }
        }
    }
}