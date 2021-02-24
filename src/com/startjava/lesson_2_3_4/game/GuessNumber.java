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

        while(!isTryOver(player1) && !isTryOver(player2)) {
            inputNum(player1);
            if (compareNums(player1) || isTryOver(player1)) {
                printNums(player1);
                if (compareNums(player1)) {
                    return;
                }
            }

            inputNum(player2);
            if (compareNums(player2) || isTryOver(player2)) {
                printNums(player2);
                if (compareNums(player2)) {
                    return;
                }
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

    private void inputNum(Player player) {
        System.out.print("Игрок " + player.getName() + ", введите число: ");
        player.setNum(scan.nextInt());
    }

    private boolean compareNums(Player player) {
        if (player.getNum() == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNum() + " c " + (player.getTryCounter()) + " попытки");
        } else {
            System.out.println("Введенное число = " + player.getNum() + ( player.getNum() < secretNumber ? " меньше загаданного " : " больше загаданного " ));
        }
        return (player.getNum() == secretNumber);
    }

    private void printNums(Player player) {
        System.out.print("Введенные числа: ");
        for (int num : player.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}