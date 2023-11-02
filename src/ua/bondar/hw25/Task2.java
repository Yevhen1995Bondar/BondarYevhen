package ua.bondar.hw25;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("мама папа тата: ");
        String input = scanner.nextLine();

        String stringWithoutSpaces = removeSpaces(input);
        boolean isPalindrome = isPalindrome(stringWithoutSpaces);

        if (isPalindrome) {
            System.out.println("Рядок без пробілів є паліндромом.");
        } else {
            System.out.println("Рядок без пробілів не є паліндромом.");
        }
    }

    // Видалення пробілів з рядка
    public static String removeSpaces(String input) {
        return input.replace(" ", "");
    }

    // Перевірка, чи є рядок паліндромом
    public static boolean isPalindrome(String input) {
        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

