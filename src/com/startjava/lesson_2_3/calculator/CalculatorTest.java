/*!
* \brief Программа - реализация калькулятора
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_2_3.calculator;

import com.startjava.lesson_2_3.calculator.Calculator;
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        String action = "yes";
        Scanner scan = new Scanner(System.in);

        while (action.equals("yes")) {
            System.out.print("Введите первое число: ");
            int num1 = scan.nextInt();
            calc.setNumber1(num1);

            System.out.print("Введите математический знак: ");
            char sign = scan.next().charAt(0);
            calc.setSign(sign);

            System.out.print("Введите второе число: ");
            int num2 = scan.nextInt();
            calc.setNumber2(num2);

            System.out.println("Результат = " + calc.calculate());

            scan.nextLine();
            do {
                System.out.print("Хотите продолжить вычисления да/нет? : ");
                action = scan.nextLine();
            } while (!action.equals("no") && !action.equals("yes"));
        }
    }
}