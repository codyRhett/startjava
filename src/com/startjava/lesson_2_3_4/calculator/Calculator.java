/*!
* \brief Класс калькулятор отвечает за проверку знака и мат.
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import static java.lang.Math.*;

public class Calculator {
    public int calculate(String expression) {
        String[] parts = expression.split(" ");

        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[2]);
        char sign = parts[1].charAt(0);

        switch (sign) {
            case '+':
                return(addExact(num1, num2));
            case '^':
                return((int) pow(num1, num2));
            case '-':
                return(subtractExact(num1, num2));
            case '*':
                return(multiplyExact(num1, num2));
            case '/':
                return(num1 / num2);
            case '%':
                return floorMod(num1, num2);
            default:
                System.out.println("Вы ввели неправильный знак");
                return -1;
        }
    }
}