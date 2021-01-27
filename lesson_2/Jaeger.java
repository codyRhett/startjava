/*!
* \brief Создание класса Jaeger
* \details
* \author Artem
* \date 15.01.2021
*/

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
        this.modelName = "Name";
        this.mark = "Mark-1";
        this.origin = "Russia";
        this.height = 28.1f;
        this.weight = 32.1f;
        this.speed = 4;
        this.strength = 6;
        this.armor = 5;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String getModelName() {
        return this.modelName;
    }

    public String getMark() {
        return this.mark;
    }

    public String getOrigin() {
        return this.origin;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWeight() {
        return this.weight;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getArmor() {
        return this.armor;
    }

    public void fight() {
        System.out.println(" Robot fights");
    }

    public void fly() {
        System.out.println(" Robot flies");
    }

    public void move() {
        System.out.println(" Robot moves");
    }

    public void useWeapon() {
        System.out.println(" Robot uses weapon");
    }
}