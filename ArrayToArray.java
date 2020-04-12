/*Создать массив случайных чисел (размером 15 элементов).
Создайте второй массив в два раза больше, первые 15 элементов должны быть равны элементам первого массива, а остальные элементы заполнить удвоенных значением начальных.*/
package HW2;

public class ArrayToArray {
    public static void main(String[] args) {
        int[] first;
        first = new int[15];

        int max = 100;
        System.out.println("Исходный массив: ");
        for(int i = 0; i<first.length; i++){
            first[i] = (int) (Math.random() * ++max);
            System.out.print(first[i] + " ");
        }

        System.out.println("\n"+"Удвоенный массив: ");
        int[] second;
        second = new int[first.length*2];

        for (int i = 0; i<second.length; i++){
            if (i<first.length){
                second[i]=first[i];
                System.out.print(second[i] + " ");
            }else {
                second[i]=first[i-15]*2;
                System.out.print(second[i] + " ");
            }
        }


    }
}
