/*!
* \brief Программа - реализация калькулятора
* \details
* \author Artem
* \date 15.01.2021
*/
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calObj = new Calculator();
        
        for(;;)
        {
            System.out.print("Введите первое число:");
            Scanner scan = new Scanner(System.in);
            int num1 = scan.nextInt();
			
            System.out.print("Введите математический знак:");
            char sign = scan.next().charAt(0);
			
            System.out.print("Введите второе число:");
            int num2 = scan.nextInt();

            calObj.setNumbers(num1, num2, sign);
            calObj.mathCalc();
            System.out.println("Результат = " + calObj.getResult());
            
            String action = "none";
            do {
                System.out.print("Хотите продолжить вычисления да/нет? : ");
                scan = new Scanner(System.in);
                action = scan.nextLine();
                if (action.equals("нет")) {
                    return;
                }
            } while (!action.equals("да"));
        }
    }
}