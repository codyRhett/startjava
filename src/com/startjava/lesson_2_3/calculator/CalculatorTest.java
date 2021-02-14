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
            System.out.print("Введите математическое выражение: ");
            String str = scan.nextLine();
            String[] strArr = str.split(" ");

            int num1 = Integer.parseInt(strArr[0]);
            int num2 = Integer.parseInt(strArr[2]);
            char sign = strArr[1].charAt(0);
            calc.setNumber1(num1);
            calc.setNumber2(num2);
            calc.setSign(sign);

            System.out.println("Результат = " + calc.calculate());
            do {
                System.out.print("Хотите продолжить вычисления [yes/no]? : ");
                action = scan.nextLine();
            } while (!action.equals("no") && !action.equals("yes"));
        }
    }
}