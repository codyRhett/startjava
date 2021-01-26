/*!
* \brief Создание класса Wolf
* \details
* \author Artem
* \date 15.01.2021
*/

public class Wolf_2 {
    private char gender;
    private String nickName;
    private float weight;
    private int age;
    private String color;

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getGender() {
        return gender;
    }

    public void setNickname(String nickName) {
        this.nickName = nickName;
    }

    public String getNickname() {
        return nickName;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setAge(int age) {
        if (age > 8) {
        System.out.println("Age is not correct");
        } else {
        this.age = age;
        }
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void walk() {

    }

    public void run() {

    }

    public void sit() {

    }

    public void howl() {

    }

    public void hunt() {

    }
}
