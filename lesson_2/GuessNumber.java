/*!
* \brief Класс калькулятор отвечает за проверку знака и мат.
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/
import java.util.Random;

public class GuessNumber {
    private int secretNumber;
    
    Player player1;
    Player player2;

    Random random = new Random();

    public GuessNumber (String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void generateNum() {
        secretNumber = random.nextInt(5);
    }

    public void setNumber1(int num1) {
        player1.setNumber(num1);
    }

    public void setNumber2(int num2) {
        player2.setNumber(num2);
    }

    public void checkNumber1() {
        if (player1.getNumber() < secretNumber) {
            System.out.println("Введенное число = " + player1.getNumber() + " меньше загаданного ");
            player1.setState("lose");
        }
        else if (player1.getNumber() > secretNumber) {
            System.out.println("Введенное число = " + player1.getNumber() + " больше загаданного ");
            player1.setState("lose");
        }
        else if (player1.getNumber() == secretNumber) {
            System.out.println("Загаданное число = " + player1.getNumber() + ". Игрок " + player1.getName() + " выиграл!");
            player1.setState("win");
        }
    }

    public void checkNumber2() {
        if (player2.getNumber() < secretNumber) {
            System.out.println("Введенное число = " + player2.getNumber() + " меньше загаданного ");
            player2.setState("lose");
        }
        else if (player2.getNumber() > secretNumber) {
            System.out.println("Введенное число = " + player2.getNumber() + " больше загаданного ");
            player2.setState("lose");
        }
        else if (player2.getNumber() == secretNumber) {
            System.out.println("Загаданное число = " + player2.getNumber() + ". Игрок " + player2.getName() + " выиграл!");
            player2.setState("win");
        }
    }
}