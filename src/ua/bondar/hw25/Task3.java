package ua.bondar.hw25;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Привет как твои дела? сегодня идет дощь: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Кількість слів у введеному рядку: " + wordCount);
    }

    // Підрахунок кількості слів у рядку
    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        return words.length;
    }
}

