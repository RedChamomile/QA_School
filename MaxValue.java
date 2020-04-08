/*Найти максимум из 3-х чисел (if else)*/
package HW1;

import java.util.Scanner;

public class MaxValue {
    public static void main(String[] args) {
        int a  = getValue();
        int b = getValue();
        int c = getValue();
        int max;

        if(a>=b){
            if(a>=c){
                max = a;
            }else{
                max = c;
            }
        }else
            if(b>=c){
                max = b;
            }else{
            max = c;
            }
        System.out.println("Максимальное значение: "+ max);
    }

    public static int getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввведите значение: ");
        return scanner.nextInt();
    }
}


