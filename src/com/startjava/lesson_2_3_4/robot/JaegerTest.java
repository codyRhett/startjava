/*!
* \brief Программа - создаие объектов роботов
* \details
* \author Artem
* \date 15.01.2021
*/
package com.startjava.lesson_2_3.robot;

import com.startjava.lesson_2_3.robot.Jaeger;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger coyoteTango = new Jaeger();
        Jaeger brawlerYukon = new Jaeger();

        coyoteTango.setModelName("Coyote Tango");
        coyoteTango.setMark("Mark-1");
        coyoteTango.setOrigin("Japan");
        coyoteTango.setHeight(85.34f);
        coyoteTango.setWeight(2.312f);
        coyoteTango.setSpeed(5);
        coyoteTango.setStrength(7);
        coyoteTango.setArmor(4);

        System.out.println("ModelName: " + coyoteTango.getModelName());
        System.out.println("Mark: " + coyoteTango.getMark());
        System.out.println("Origin: " + coyoteTango.getOrigin());
        System.out.println("Height: " + coyoteTango.getHeight());
        System.out.println("Weight: " + coyoteTango.getWeight());
        System.out.println("Speed: " + coyoteTango.getSpeed());
        System.out.println("Strength: " + coyoteTango.getStrength());
        System.out.println("Armor: " + coyoteTango.getArmor());

        coyoteTango.fight();
        coyoteTango.fly();
        coyoteTango.move();
        coyoteTango.useWeapon();

        brawlerYukon.setModelName("Brawler Yukon");
        brawlerYukon.setMark("Mark-1");
        brawlerYukon.setOrigin("USA");
        brawlerYukon.setHeight(54.34f);
        brawlerYukon.setWeight(1.312f);
        brawlerYukon.setSpeed(6);
        brawlerYukon.setStrength(5);
        brawlerYukon.setArmor(7);

        System.out.println("ModelName: " + brawlerYukon.getModelName());
        System.out.println("Mark: " + brawlerYukon.getMark());
        System.out.println("Origin: " + brawlerYukon.getOrigin());
        System.out.println("Height: " + brawlerYukon.getHeight());
        System.out.println("Weight: " + brawlerYukon.getWeight());
        System.out.println("Speed: " + brawlerYukon.getSpeed());
        System.out.println("Strength: " + brawlerYukon.getStrength());
        System.out.println("Armor: " + brawlerYukon.getArmor());

        brawlerYukon.fight();
        brawlerYukon.fly();
        brawlerYukon.move();
        brawlerYukon.useWeapon();
    }
}