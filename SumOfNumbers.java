/*Дано 2 числа типа String и вернуть их сумму тоже в String*/
package HW1;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        String firstNumber = getValue();
        String secondNumber = getValue();
        String sum = Integer.toString(Integer.parseInt(firstNumber)+Integer.parseInt(secondNumber));
        System.out.println("Сумма: " + sum);
    }

    public static String getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите значение: ");
        return scanner.next();
    }
}
