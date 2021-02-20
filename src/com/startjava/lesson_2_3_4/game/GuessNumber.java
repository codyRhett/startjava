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
    private Scanner scan;

    public GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    private int checkNumbers(Player player) {
        System.out.print("Игрок " + player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());
        if (player.getNumber() < secretNumber) {
            System.out.println("Введенное число = " + player.getNumber() + " меньше загаданного ");
        } else if (player.getNumber() > secretNumber) {
            System.out.println("Введенное число = " + player.getNumber() + " больше загаданного ");
        } else if (player.getNumber() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " c " + (player.getTryCounter()+1) + " попытки");
            System.out.print("Введенные числа: ");
            for (int i = 0; i < player.getTryCounter(); i++) {
                System.out.print(player.getPutNumbers()[i] + " ");
            }
            System.out.println();
            return 1;
        }

        player.incTryCnt();

        if (player.getTryCounter() > 9) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            System.out.print("Введенные числа: ");
            for (int i = 0; i < player.getTryCounter(); i++) {
                System.out.print(player.getPutNumbers()[i] + " ");
            }
            System.out.println();
        }
        return 0;
    }

    public void start() {
        scan = new Scanner(System.in);
        secretNumber = new Random().nextInt(100) + 1;

        player1.fillZeroes();
        player2.fillZeroes();

        while((player1.getTryCounter() < 10) && (player2.getTryCounter() < 10)) {
            if  ((checkNumbers(player1)) == 1 || (checkNumbers(player2) == 1)) {
                return;
            }
        }
    }
}