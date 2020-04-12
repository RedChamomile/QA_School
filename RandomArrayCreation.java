/*Написать код для возможности создания массива целых чисел (размер вводиться с клавиатуры) заполнените элементы произвольными числами.
Выведите этот массив на экран. */
package HW2;

import java.util.Scanner;

public class RandomArrayCreation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ввведите длинну массива: ");
        int length=scanner.nextInt();

        int[] array;
        array = new int[length];

        int max = 100;

        for(int i = 0; i<array.length; i++){
            array[i] = (int) (Math.random() * ++max);
            System.out.print(array[i] + " ");
        }
    }
}
