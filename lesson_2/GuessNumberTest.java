/*!
* \brief 
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/
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

        while (!player1.getAction().equals("no") && !player2.getAction().equals("no")) {
            System.out.println("Игра началась!!!");
            guessNum.generateNum();

            while (true) {
                guessNum.checkNumbers(player1);
                if (player1.getState().equals("win")) {
                    while (!player1.getAction().equals("no") && !player1.getAction().equals("yes")) {
                        System.out.print("Хотите продолжить? [yes/no]: ");
                        player1.setAction(scan.nextLine());
                    }
                    if (player1.getAction().equals("no")) {
                        return;
                    } else {
                        player1.setAction("none");
                        break;
                    }
                }

                guessNum.checkNumbers(player2);
                if (player2.getState().equals("win")) {
                    while (!player2.getAction().equals("no") && !player2.getAction().equals("yes")) {
                        System.out.print("Хотите продолжить? [yes/no]: ");
                        player2.setAction(scan.nextLine());
                    }
                    if (player2.getAction().equals("no")) {
                        return;
                    } else {
                        player2.setAction("none");
                        break;
                    }
                }
            }
        }
    }
}