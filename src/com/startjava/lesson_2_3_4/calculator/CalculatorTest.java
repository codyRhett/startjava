/*!
* \brief Программа - реализация калькулятора
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String action = "yes";
        Scanner scan = new Scanner(System.in);

        while (action.equals("yes")) {
            System.out.print("Введите математическое выражение: ");
            String expression  = scan.nextLine();

            System.out.println("Результат = " + calc.calculate(expression));
            do {
                System.out.print("Хотите продолжить вычисления [yes/no]? : ");
                action = scan.nextLine();
            } while (!action.equals("no") && !action.equals("yes"));
        }
    }
}