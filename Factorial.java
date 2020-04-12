/*Вычислить с помощью цикла факториал числа - n введенного с клавиатуры (4<n<16). Факториал числа это произведение всех чисел от этого числа до 1*/
package HW2;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ввведите число: ");
        int value=scanner.nextInt();
        int result = 1;

        if (value<4 || value>16){
            System.out.println("Некорректно заданное значение");
        }else {
            for (int i=1; i<=value; i++){
                result = result*i;
            }
            System.out.println(value+"! = "+result);
        }
    }
}
