package by.tms.homework2array;

import java.util.Arrays;
import java.util.Scanner;

/*2. Написать программу, удаляющую все целые числа из массива, которые равны тому,
что ввёл пользователь. В результате должен получиться новый массив, в котором нет заданных элементов.
 Распечатать полученный массив.
*/
public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberDelet = scanner.nextInt();
        int array[] = {5, 8, 10, 8, 25};
        System.out.println("Before deletion:" + Arrays.toString(array));
        int startNum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberDelet) {
                startNum++;
                for (int j = i; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        System.out.println("After deletion:");
        for (int i = 0; i < array.length - startNum; i++) {
            System.out.print(array[i] + " ");
        }
    }
}

