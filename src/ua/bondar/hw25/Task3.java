package ua.bondar.hw25;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Я Бондарь Евгений, Ученик школы А-ЛЕВЕЛ: ");
        String input = scanner.nextLine();

        int wordCount = countWords(input);
        System.out.println("Кількість слів у введеному рядку: " + wordCount);
    }

    public static int countWords(String input) {
        // Розділити рядок на слова, використовуючи пробіли як роздільник
        String[] words = input.split("\\s+");
        return words.length;
    }
}
