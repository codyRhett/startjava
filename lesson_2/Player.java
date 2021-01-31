/*!
* \brief
* вычисления
* \details
* \author Artem
* \date 15.01.2021
*/

public class Player {
    private String name;
    private int number;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}