/*!
* \brief Класс калькулятор отвечает за проверку знака и мат.
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_2_3.calculator;

import java.lang.Math;

import static java.lang.Math.*;

public class Calculator {
        private int result;
        private int num1;
        private int num2;
        private char sign;

        public void setNumber1(int num1) {
            this.num1 = num1;
        }

        public void setNumber2(int num2) {
            this.num2 = num2;
        }

        public void setSign(char sign) {
            this.sign = sign;
        }

        public int calculate() {
            switch (sign) {
                case '+':
                    result = addExact(num1, num2);
                    break;
                case '^':
                    result = (int) pow(num1, num2);
                    break;
                case '-':
                    result = subtractExact(num1, num2);
                    break;
                case '*':
                    result = multiplyExact(num1, num2);
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = floorMod(num1, num2);
                    break;
                default:
                    System.out.println("Вы ввели неправильный знак");
                    break;
            }
            return result;
        }
}