/*Дан массив {0,5,2,4,7,1,3,19} — написать программу для подсчета нечетных цифр в нем*/
package HW2;

public class OddNumberCounting {
    public static void main(String[] args) {
        int[] array= {0,5,2,4,7,1,3,19};
        int count = 0;

        for (int i = 0; i<array.length; i++){
            if( array[i] % 2!=0){
                count++;
            }
        }
        System.out.println("В заданном массиве "+ count+ " нечетных цифр");
    }
}
