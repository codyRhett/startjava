/*!
* \brief Класс калькулятор отвечает за проверку знака и мат.
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/

package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    private int secretNumber;
    private Player player1;
    private Player player2;
    private Scanner scan;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        scan = new Scanner(System.in);
        secretNumber = new Random().nextInt(100) + 1;

        player1.fillZeroes();
        player2.fillZeroes();

        while (!isTryOver(player1) && !isTryOver(player2)) {
            inputNums(player1);
            if (compareNums(player1)) {
                printNums(player1);
                return;
            }
            player1.incTryCounter();
            if (isTryOver(player1)) {
                printNums(player1);
            }

            inputNums(player2);
            if (compareNums(player2)) {
                printNums(player2);
                return;
            }
            player2.incTryCounter();
            if (isTryOver(player2)) {
                printNums(player2);
            }
        }
    }

    private boolean isTryOver(Player player) {
        if (player.getTryCounter() > 9) {
            System.out.println("У игрока " + player.getName() + " закончились попытки");
            return true;
        }
        return false;
    }

    private void inputNums(Player player) {
        System.out.print("Игрок " + player.getName() + ", введите число: ");
        player.setNum(scan.nextInt());
    }

    private boolean compareNums(Player player) {
        if (player.getNum() < secretNumber) {
            System.out.println("Введенное число = " + player.getNum() + " меньше загаданного ");
        } else if (player.getNum() > secretNumber) {
            System.out.println("Введенное число = " + player.getNum() + " больше загаданного ");
        } else if (player.getNum() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNum() + " c " + (player.getTryCounter()+1) + " попытки");
            return true;
        }
        return false;
    }

    private void printNums(Player player) {
        System.out.print("Введенные числа: ");
        for (int num : player.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}