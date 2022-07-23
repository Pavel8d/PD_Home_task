package by.tms.homework5string.task1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");

        String stringToCheck = scanner.nextLine();
        StringBuilder reversString = new StringBuilder(stringToCheck);

        if (stringToCheck.equalsIgnoreCase(reversString.reverse().toString()))
            System.out.println(stringToCheck + " - Палиндром");
        else
            System.out.println(stringToCheck + " - НЕ палиндром");
    }
}



