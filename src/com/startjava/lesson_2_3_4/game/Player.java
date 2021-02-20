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
    private int tryCounter;

    public Player(String name) {
        this.name = name;
        numbers = new int[20];
    }

    public int getTryCounter() {
        return tryCounter;
    }

    public void incTryCnt() {
        tryCounter++;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        numbers[tryCounter] = number;
    }

    public void fillZeroes() {
        Arrays.fill(numbers, 0, tryCounter, 0);
        tryCounter = 0;
    }

    public int getNumber() {
        return numbers[tryCounter];
    }

    public int[] getPutNumbers() {
        return Arrays.copyOf(numbers, tryCounter);
    }
}