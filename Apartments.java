/*Есть девятиэтажный дом, в котором 4 подъезда. Номер подъезда начинается с единицы. На одном этаже 4 квартиры.
Напишите программу которая получит номер квартиры с клавиатуры, и выведет на экран на каком этаже,
какого подъезда расположенна эта квартира. Если такой квартиры нет в этом доме то нужно сообщить об этом пользователю. */
package HW2;

import java.util.Scanner;

public class Apartments {
    public static void main(String[] args) {
        int entrances=4;
        int floors=9;
        int apr_per_floor=4;
        int total_apartments=apr_per_floor * floors * entrances;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ввведите номер квартиры: ");
        int apartment=scanner.nextInt();

        int floor;
        int entrance;
        if ((apartment > total_apartments) || (apartment == 0)) {
            System.out.print("В выбранном доме нет квартиры с заданным номером");

        } else {
            entrance = apartment / (apr_per_floor * floors);
            if (apartment % (apr_per_floor * floors) != 0) entrance++;

            floor=apartment / apr_per_floor - floors * (entrance - 1);
            if (apartment % apr_per_floor != 0) floor++;

            System.out.println("Указанная квартира находится в " + entrance + " подъезде, на " + floor + " этаже");
        }
    }
}
