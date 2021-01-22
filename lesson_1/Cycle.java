/*!
* \brief Программа - демонстрация работы с циклами
* \details
* \author Artem
* \date 15.01.2021
*/

public class Cycle {
    public static void main(String[] args) {
        System.out.println("Numbers from 0 to 20");
        for (int i = 0; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("Numbers from 6 till -6 with step=2");
        int i = -6;
        while(i <= 6) {
            System.out.println(i);
            i += 2;
        }

        System.out.println("Sum of odd numbers from 10 to 20");
        int j = 10;
        int sumOdd = 0;
        do {
            if ((j % 2) != 0) {
                sumOdd += j;
            }
            j++;
        } while(j <= 20);
        System.out.println(sumOdd);
    }
}