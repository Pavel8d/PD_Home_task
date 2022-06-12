package by.tms.lesson3;

import java.util.Scanner;

/*
1. Написать программу, вычисляющую сумму цифр
введённого пользователем целого числа.
Способ 2
 */
public class SumNumb1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Please enter the number to check...");
        int num = Scanner.nextInt();
        int sum = 0;
        while (num != 0) {
            sum += (num % 10);
            num /= 10;
        }
        System.out.println(sum + " -sum of numbers");
    }
}
