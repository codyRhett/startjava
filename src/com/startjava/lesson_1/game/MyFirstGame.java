/*!
* \brief
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_1.game.myfirstgame;

public class MyFirstGame {
    public static void main(String[] args) {
        System.out.println("GUESS A NUMBER");
        int secretNumber = 5; // число, загаданное компьютером
        int playerNumber = 1; // число, заданное пользователем начальное

        do {// Перебираем все числа до того момента, пока не угадаем
            if (playerNumber < secretNumber) {
                System.out.println("Введенное число = " + playerNumber + " меньше загаданного ");
                playerNumber++;
            }
            else if (playerNumber > secretNumber) {
                System.out.println("Введенное число = " + playerNumber + "больше загаданного ");
                playerNumber--;
            }
        } while (playerNumber != secretNumber);
        System.out.println("Загаданное число = " + playerNumber + "  Вы угадали!");
    }
}