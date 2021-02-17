/*!
* \brief
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_2_3_4.game;

import java.util.Stack;

public class Player {
    private String name;
    private int number;
    private Stack mStack;

    public Player(String name) {
        this.name = name;
        int[] numbers = new int[20];
        mStack = new Stack();
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        mStack.addElement(number);
    }

    public int getNumber(int index) {
        return (int)mStack.get(index);
    }
}