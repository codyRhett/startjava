/*!
* \brief Программа - реализация калькулятора
* \details
* \author Artem
* \date 15.01.2021
*/
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcObj = new Calculator();
        
        while(true)
        {
            System.out.print("Введите первое число:");
            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
            calcObj.setNumber1(num1);

            System.out.print("Введите математический знак:");
            char sign = scan.next().charAt(0);
            calcObj.setSign(sign);

            System.out.print("Введите второе число:");
            int num2 = scan.nextInt();
            calcObj.setNumber2(num2);

            System.out.println("Результат = " + calcObj.runCalc());
            
            String action = "yes";
            action = scan.nextLine();
            do {
                if (action.equals("нет")) {
                    return;
                }
                System.out.print("Хотите продолжить вычисления да/нет? : ");
                action = scan.nextLine();
            } while (!action.equals("да"));
        }
    }
}