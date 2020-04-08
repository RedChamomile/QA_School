/*Написать программу которая вычислит и выведет на экран площадь треугольника если известны его стороны*/
package HW1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("Ввведите первую сторону в мм: ");
        double a = scanner.nextInt();
        System.out.print("Ввведите вторую сторону в мм: ");
        double b = scanner.nextInt();
        System.out.print("Ввведите третью сторону в мм: ");
        double c = scanner.nextInt();
        double p = (a+b+c)/2;
        double S = (p*(p-a)*(p-b)*(p-c));
        if (S != 0) {
            System.out.println("Площадь треугольника с заданными сторонами составляет: " + df.format(S) + " мм^2");
        }else{
            System.out.println("Треугольник с такими сторонами не существует");
        }
    }
}
