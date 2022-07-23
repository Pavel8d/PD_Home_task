package by.tms.homework5string.task2;

import java.util.Scanner;

public class RomanNumerals {

    public static void main(String[] args) {

        System.out.print("Введите римские цифры: ");

        Scanner symbolRoman = new Scanner(System.in);
        String inputRomanSymbols = symbolRoman.next();

        inputRomanSymbols = inputRomanSymbols.toUpperCase();

        if (inputRomanSymbols.matches(".*[0-9].*") || !inputRomanSymbols.matches("[M|D|C|L|X|V|I]*")) {
            System.out.println("Символ введён неверно!");
        }
        int positionInRomanStr = 0;
        int currentRomanConversion = 0;
        int previousRomanConversion = 0;
        int arabicNumeralEquivalent = 0;

        while (positionInRomanStr < inputRomanSymbols.length()) {
            char letter = inputRomanSymbols.charAt(positionInRomanStr);
            switch (letter) {
                case ('I'):
                    currentRomanConversion = 1;
                    break;
                case ('V'):
                    currentRomanConversion = 5;
                    break;
                case ('X'):
                    currentRomanConversion = 10;
                    break;
                case ('L'):
                    currentRomanConversion = 50;
                    break;
                case ('C'):
                    currentRomanConversion = 100;
                    break;
                case ('D'):
                    currentRomanConversion = 500;
                    break;
                case ('M'):
                    currentRomanConversion = 1000;
                    break;
            }
            if (currentRomanConversion > previousRomanConversion) {
                arabicNumeralEquivalent += currentRomanConversion - (previousRomanConversion * 2);
            } else {
                arabicNumeralEquivalent += currentRomanConversion;
            }
            previousRomanConversion = currentRomanConversion;
            positionInRomanStr += 1;
        }
        System.out.println("Арабские цифры: " + arabicNumeralEquivalent);
    }
}
