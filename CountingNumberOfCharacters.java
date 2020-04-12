/*Введите строку текста с клавиатуры — реализуйте программу для
возможности подсчета количества символа — 'b' в этой строке, с выводом результат на экран*/
package HW2;

import java.util.Scanner;

public class CountingNumberOfCharacters {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ввведите строку: ");
        String str = scanner.next();
        int count = 0;
        String pattern = "b";

        for(int i = 0; i<str.length(); i++){
            if (str.regionMatches(i, pattern, 0, 1 ))
                count++;
        }
        System.out.println(count);
    }
}
