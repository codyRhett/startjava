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

        GuessNumber guessNum = new GuessNumber(name1, name2);
        
        String act = "yes";
        while (act.equals("yes")) {
            System.out.println("Игра началась!!!");
            guessNum.generateNum();
            while (true) {
                System.out.print(guessNum.player1.getName() + ", введите число: ");
                int num1 = scan.nextInt();
                guessNum.player1.setNumber(num1);
                guessNum.checkNumber1();
                if (guessNum.player1.getState().equals("win")) {
                    scan.nextLine();
                    do {
                        System.out.print("Хотите продолжить? : ");
                        act = scan.nextLine();
                    } while(!act.equals("yes") && !act.equals("no"));
                    break;
                }

                System.out.print(guessNum.player2.getName() + ", введите число: ");
                int num2 = scan.nextInt();
                guessNum.player2.setNumber(num2);
                guessNum.checkNumber2();
                if (guessNum.player2.getState().equals("win")) {
                    scan.nextLine();
                    do {
                        System.out.print("Хотите продолжить? : ");
                        act = scan.nextLine();
                    } while (!act.equals("yes") && !act.equals("no"));
                    break;
                }
            }
        }
    }
}