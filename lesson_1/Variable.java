/*!
* \brief Программа вывода характеристик ПК
* \details Прорамма выводит на экран значения параметров компьютера
* в разных типах данных
* \author Artem
* \date 15.01.2021
*/

public class Variable {
    public static void main(String[] args) {
        byte digit = 64; 
        short ramCapacity = 4000;
        int cpuNumber = 4;
        long cpuFreq = 1700000000;
        float osVersion = 16.4f;
        double freeSpace = 23.7;
        char ubuntuType = 'L';
        boolean number = true;

        System.out.println("digit = " + digit);
        System.out.println("ramCapacity = " + ramCapacity);
        System.out.println("cpuNumber = " + cpuNumber);
        System.out.println("cpuFreq = " + cpuFreq);
        System.out.println("osVersion = " + osVersion);
        System.out.println("freeSpace = " + freeSpace);
        System.out.println("ubuntuType = " + ubuntuType);
        System.out.println("number = " + number);
    }
}