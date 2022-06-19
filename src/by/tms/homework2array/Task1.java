package by.tms.homework2array;

import java.util.Arrays;

/*1. Напишите программу, которая циклически сдвигает элементы массива
 вправо на одну позицию, и печатает результат. Цикличность означает,
  что последний элемент массива становится самым первым его элементом.
  Пример: {1,2,3,4,5} -> {5,1,2,3,4}
*/
public class Task1 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        int lastIndex = array[array.length - 1];
        for (int i = array.length - 2; i >= 0; i--) {
            array[i + 1] = array[i];
        }
        array[0] = lastIndex;{
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
    }
}