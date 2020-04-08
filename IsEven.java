/*Определить четное или нечетное число. Если четное вывести true если не четное false*/
package HW1;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        int value = getValue();
        System.out.println(value % 2 == 0);
    }

    public static int getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите значение: ");
        return scanner.nextInt();
    }
}
