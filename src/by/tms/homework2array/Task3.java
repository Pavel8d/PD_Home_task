package by.tms.homework2array;

//3. Написать программу, которая преобразовывает двумерный массив в одномерный массив со всеми элементами двумерного.

public class Task3 {
    public static void main(String[] args) {

        int[][] doubleArray = new int[5][7];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++)
                doubleArray[i][j] = (i * 7 + j + 1);
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(doubleArray[i][j]);
                System.out.print("  ");
            }
            System.out.println();
        }
        int[] array = new int[35];
        int startNum = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 7; j++) {
                array[startNum++] = doubleArray[i][j];
                System.out.print(doubleArray[i][j]);
                System.out.print("  ");
            }
        }
    }
}

