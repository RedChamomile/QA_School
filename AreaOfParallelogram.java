/*Есть 2 стороны параллелограмма. Найти площадь параллелограмма*/
package HW1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");
        System.out.print("Ввведите первую сторону в мм: ");
        int a = scanner.nextInt();
        System.out.print("Ввведите вторую сторону в мм: ");
        int b = scanner.nextInt();
        System.out.print("Ввведите угол в градусах: ");
        int alpha = scanner.nextInt();
        System.out.println("Площадь параллелограмма с заданными сторонами составляет: "+df.format(a*b*Math.sin(Math.toRadians(alpha)))+" мм^2");
    }
}
