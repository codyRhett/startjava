/*!
* \brief Класс калькулятор отвечает за проверку знака и мат.
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/

package com.startjava.lesson_2_3.game;

import com.startjava.lesson_2_3.game.Player;

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
        player1.numbers = new int[11];
        player2.numbers = new int[11];
        int[] arr;// = new int[10];

        int i = 0;
        while(true) {
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            player1.numbers[i] = scan.nextInt();
            player1.setNumber(player1.numbers[i]);

            if (player1.getNumber() < secretNumber) {
                System.out.println("Введенное число = " + player1.getNumber() + " меньше загаданного ");
            } else if (player1.getNumber() > secretNumber) {
                System.out.println("Введенное число = " + player1.getNumber() + " больше загаданного ");
            } else if (player1.getNumber() == secretNumber) {
                System.out.println("Игрок " + player1.getName() + "угадал число " + player1.getNumber() + "c" + i + "попытки");
                arr = Arrays.copyOf(player1.numbers, i);
                for (int j = 0; j < i; j++) {
                    System.out.println(arr[j]);
                }
                return;
            }

            if (i > 9) {
                System.out.println("Игра закончилось!!!");
                arr = Arrays.copyOf(player1.numbers, 10);
                for (int j = 0; j < i; j++) {
                    System.out.println(arr[j]);
                }
                return;
            }

            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            player2.numbers[i] = scan.nextInt();
            player2.setNumber(player2.numbers[i]);

            if (player2.getNumber() < secretNumber) {
                System.out.println("Введенное число = " + player2.getNumber() + " меньше загаданного ");
            } else if (player2.getNumber() > secretNumber) {
                System.out.println("Введенное число = " + player2.getNumber() + " больше загаданного ");
            } else if (player2.getNumber() == secretNumber) {
                System.out.println("Игрок " + player2.getName() + "угадал число " + player2.getNumber() + "c" + i + "попытки");
                arr = Arrays.copyOf(player2.numbers, i);
                for (int j = 0; j < i; j++) {
                    System.out.println(arr[j]);
                }
                return;
            }

            if (i > 9) {
                System.out.println("Игра закончилось!!!");
                arr = Arrays.copyOf(player2.numbers, 10);
                for (int j = 0; j < i; j++) {
                    System.out.println(arr[j]);
                }
                return;
            }

            i++;
        }
    }
}