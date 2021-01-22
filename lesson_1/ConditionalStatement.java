/*!
* \brief Программа - демонстрация работы с операторами
* \details
* \author Artem
* \date 15.01.2021
*/

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 21;
        if (age > 30) {
            System.out.println("age is more than 30 \n");
        }

        if (gender == 'M') {
            System.out.println("gender is masculine \n");
        }

        char gender = 'M';
        if (gender != 'M') {
            System.out.println("gender is feminine \n");
        }

        float height = 1.78f;
        if (height < 1.80) {
            System.out.println("height is less than 180 cm \n");
        } else {
            System.out.println("height is more than 180 cm \n");
        }

        String name = "Artem";
        if (name.charAt(0) == 'M') {
            System.out.println("first letter is M \n");
        } else if (name.charAt(0) == 'I') {
            System.out.println("first letter is I \n");
        } else {
            System.out.println("first letter is neither M nor I  \n");
        }
    }
}