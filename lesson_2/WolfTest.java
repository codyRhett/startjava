/*!
* \brief Создание класса Wolf
* \details
* \author Artem
* \date 15.01.2021
*/

class Wolf {
    private char gender;
    private String nickName;
    private float weight;
    private int age;
    private String color;

    void walk() {

    }
    void run() {

    }
    void sit() {

    }
    void howl() {

    }
    void hunt() {

    }
}

public class WolfTest {
    public static void main(String[] args) {
       Wolf redWolf = new Wolf();

       redWolf.gender = 'M';
       redWolf.nickname = "Jack";
       redWolf.weight = 100.4f;
       redWolf.age = 5;
       redWolf.color = "black";

       System.out.println("Пол: " + redWolf.gender);
       System.out.println("Кличка: " + redWolf.nickname);
       System.out.println("Вес: " + redWolf.weight);
       System.out.println("Возоаст: " + redWolf.age);
       System.out.println("Цвет: " + redWolf.color);

       redWolf.walk();
       redWolf.run();
       redWolf.sit();
       redWolf.howl();
       redWolf.hunt();
    }
}