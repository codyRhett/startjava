/*!
* \brief Класс калькулятор отвечает за проверку знака и мат.
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/

public class Calculator {
        private int result = 1;
        private int num1, num2;
        private char sign;

        public void setNumbers(int num1, int num2, char sign) {
            this.num1 = num1;
            this.num2 = num2;
            this.sign = sign;
        }

        public int getResult() {
            return result;
        }

        public void mathCalc() {
            switch (sign) {
                case '+':
                    result = num1 + num2;
                break;
                case '^':
                    for (int i = 1; i <= num2; i++) {
                        result *= num1;
                    }
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
                case '%':
                    result = num1 % num2;
                    break;
                default:
                    System.out.println("Вы ввели неправильный знак");
                break;
            }
        }
}