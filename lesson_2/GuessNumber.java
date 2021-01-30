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
    
    Player player1;
    Player player2;

    Random random = new Random();

    public GuessNumber (Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void generateNum() {
        secretNumber = random.nextInt(5);
    }

    public void checkNumbers(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Игрок " + player.getName() + ", введите число: ");
        player.setNumber(scan.nextInt());

        if (player.getNumber() < secretNumber) {
            System.out.println("Введенное число = " + player.getNumber() + " меньше загаданного ");
            player.setState("lose");
        }
        else if (player.getNumber() > secretNumber) {
            System.out.println("Введенное число = " + player.getNumber() + " больше загаданного ");
            player.setState("lose");
        }
        else if (player.getNumber() == secretNumber) {
            System.out.println("Загаданное число = " + player.getNumber() + ". Игрок " + player.getName() + " выиграл!");
            player.setState("win");
        }
    }
}