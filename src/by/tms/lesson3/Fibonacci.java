package by.tms.lesson3;

import java.util.Scanner;

/*2. Написать программу, вычисляющую и отображающую все числа
Фибоначчи меньше введённого пользователем целого числа.
 */

public class Fibonacci {

    public static void main(String[] args) {

        int maxNum = 0;
        int previousNum = 0;
        int nextNum = 1;
        System.out.println("Quantity numbers?");
        Scanner scanner = new Scanner(System.in);
        maxNum = scanner.nextInt();

        for (int num = 1; num <= maxNum; ++num) {
            System.out.print(previousNum + " ");
            int sum = previousNum + nextNum;
            previousNum = nextNum;
            nextNum = sum;
        }


    }
}
