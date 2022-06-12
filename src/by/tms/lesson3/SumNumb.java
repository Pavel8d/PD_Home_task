package by.tms.lesson3;
/*
1. Написать программу, вычисляющую сумму цифр
введённого пользователем целого числа.
Способ 1
 */

public class SumNumb {

    public static void main(String[] args) {
        int num1 = 565;
        int num2 = num1;
        int sum = 0;
        while (num2 != 0) {
            sum += num2 % 10;
            num2 /= 10;
        }
        System.out.println("Сумма цифр в числе " + num1 + " = " + sum);
    }

}

//Второй способ


