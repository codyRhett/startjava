/*!
* \brief
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Stack;

public class Player {
    private String name;
    private int[] numbers;

    public Player(String name) {
        this.name = name;
        numbers = new int[20];
        Arrays.fill(numbers, 0);
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number, int index) {
        numbers[index] = number;
    }

    public void fillZeroes(int indexTo) {
        Arrays.fill(numbers, 0, indexTo, 0);
    }

    public int getNumber(int index) {
        return (numbers[index]);
    }

    public int[] getArray(int part) {
        return (Arrays.copyOf(numbers, cntPart));
    }
}