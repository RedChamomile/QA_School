/*С помощью циклов нарисовать «обои». Причем количество полос должно вводиться с клавиатуры. В примере 7 полос.
 ***+++***+++***+++***
 ***+++***+++***+++***
 ***+++***+++***+++***
 ***+++***+++***+++***
 ***+++***+++***+++*** */
package HW2;

import java.util.Scanner;

public class Wallpaper {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ввведите количество полос: ");
        int count=scanner.nextInt();

        for (int i = 0; i<5; i++){
            for(int j=0; j<count; j++){
                if(j%2!=0){
                    System.out.print("***");
                }else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }
    }
}
