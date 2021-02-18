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
    private int tryCnt;

    public Player(String name) {
        this.name = name;
        numbers = new int[20];
    }

    public int getTryCnt() {
        return tryCnt;
    }

    public void incrTryCnt() {
        this.tryCnt++;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        numbers[tryCnt] = number;
    }

    public void fillZeroes() {
        Arrays.fill(numbers, 0, tryCnt, 0);
        tryCnt = 0;
    }

    public int getNumber() {
        return (numbers[tryCnt]);
    }

    public int[] getArray() {
        return (Arrays.copyOf(numbers, tryCnt));
    }
}