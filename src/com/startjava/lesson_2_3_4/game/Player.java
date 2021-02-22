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
    private int[] nums;
    private int tryCounter;

    public Player(String name) {
        this.name = name;
        nums = new int[20];
    }

    public String getName() {
        return name;
    }

    public void setNum(int num) {
        nums[tryCounter] = num;
    }

    public int getNum() {
        return nums[tryCounter];
    }

    public int[] getEnteredNums() {
        return Arrays.copyOf(nums, tryCounter);
    }

    public int getTryCounter() {
        return tryCounter;
    }

    public void incTryCounter() {
        tryCounter++;
    }

    public void fillZeroes() {
        Arrays.fill(nums, 0, tryCounter, 0);
        tryCounter = 0;
    }
}