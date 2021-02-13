/*!
* \brief Программа - реализация калькулятора
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_1.calculator.calculator;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("CALCULATOR");
        int num1 = 3;
        int num2 = 1;
        char sign = '*';

        if (sign == '+') {
            System.out.println("sum = " + (num1 + num2));
        } else if (sign == '^') {
            int expon = 1;
            for (int i = 1; i < num2; i++) {
                 expon *= num1;
            }
            System.out.println("expon = " + expon);
        } else if (sign == '-') {
            System.out.println("diff = " + (num1 - num2));
        } else if (sign == '*') {
            System.out.println("mult = " + (num1 * num2));
        } else if (sign == '/') {
            System.out.println("div = " + (num1 / num2));
        } else if (sign == '%') {
            System.out.println("div_x = " + (num1 % num2));
        }
    }
}