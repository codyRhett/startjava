/*!
* \brief 
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scan.nextLine();

        System.out.print("Введите имя второго игрока: ");
        String name2 = scan.nextLine();

        Player player1 = new Player(name1);
        Player player2 = new Player(name2);

        GuessNumber guessNum = new GuessNumber(player1, player2);

        String answer;
        do {
            System.out.println("Игра началась!!!");
            System.out.println("У вас 10 попыток");
            guessNum.start();
            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scan.nextLine();
            } while(!answer.equals("yes") && !answer.equals("no"));
        } while(answer.equals("yes"));
    }
}