/*!
* \brief Класс калькулятор отвечает за проверку знака и мат.
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/
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
        while(true) {
            System.out.print("Игрок " + player1.getName() + ", введите число: ");
            player1.setNumber(scan.nextInt());
            if (player1.getNumber() < secretNumber) {
                System.out.println("Введенное число = " + player1.getNumber() + " меньше загаданного ");
            } else if (player1.getNumber() > secretNumber) {
                System.out.println("Введенное число = " + player1.getNumber() + " больше загаданного ");
            } else if (player1.getNumber() == secretNumber) {
                System.out.println("Загаданное число = " + player1.getNumber() + ". Игрок " + player1.getName() + " выиграл!");
                return;
            }

            System.out.print("Игрок " + player2.getName() + ", введите число: ");
            player2.setNumber(scan.nextInt());
            if (player2.getNumber() < secretNumber) {
                System.out.println("Введенное число = " + player2.getNumber() + " меньше загаданного ");
            } else if (player2.getNumber() > secretNumber) {
                System.out.println("Введенное число = " + player2.getNumber() + " больше загаданного ");
            } else if (player2.getNumber() == secretNumber) {
                System.out.println("Загаданное число = " + player2.getNumber() + ". Игрок " + player2.getName() + " выиграл!");
                return;
            }
        }
    }
}