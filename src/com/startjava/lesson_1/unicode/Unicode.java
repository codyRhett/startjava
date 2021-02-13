/*!
* \brief 
* \details Вывод Unicode
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_1.unicode;

public class Unicode {
    public static void main(String[] args) {
        for (int i = 33; i < 126; i++) {
            System.out.printf("%3s", (char) i);
        }
    }
}