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
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        secretNumber = new Random().nextInt(100) + 1;

        player1.fillZeroes();
        player2.fillZeroes();

        boolean tryOver1 = false;
        boolean tryOver2 = false;
        while(!tryOver1 && !tryOver2) {
            inputNum(player1);
            if (compareNums(player1)) {
                break;
            }
            tryOver1 = isTryOver(player1);

            inputNum(player2);
            if (compareNums(player2)) {
                break;
            }
            tryOver2 = isTryOver(player2);
        }
        printNums(player1);
        printNums(player2);
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
        int num = player.getNum();
        if (num == secretNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + num + " c " + player.getTryCounter() + " попытки");
        } else {
            String result = num < secretNumber ? " меньше " : " больше ";
            System.out.println("Введенное число = " + num + result + "загаданного");
        }
        return (num == secretNumber);
    }

    private void printNums(Player player) {
        System.out.print("Введенные числа игрока " + player.getName() + " : ");
        for (int num : player.getEnteredNums()) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}