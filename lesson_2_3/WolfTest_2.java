/*!
* \brief Создание класса WolfTest_2
* \details
* \author Artem
* \date 15.01.2021
*/

public class WolfTest_2 {
    public static void main(String[] args) {
       Wolf_2 redWolf = new Wolf_2();

       redWolf.setGender('M');
       redWolf.setNickname("Jack");
       redWolf.setWeight(100.2f);
       redWolf.setAge(9);
       redWolf.setColor("red");

       System.out.println("Пол: " + redWolf.getGender());
       System.out.println("Кличка: " + redWolf.getNickname());
       System.out.println("Вес: " + redWolf.getWeight());
       System.out.println("Возоаст: " + redWolf.getAge());
       System.out.println("Цвет: " + redWolf.getColor());
    }
}