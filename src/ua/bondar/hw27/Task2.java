package ua.bondar.hw27;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] originalArray = {10, 8, 6, 4, 2, 1}; // Приклад масиву для перевірки
        boolean isSorted = isSortedDescending(originalArray);

        System.out.println("Масив: " + Arrays.toString(originalArray));
        System.out.println("Масив в упорядкованому порядку за спаданням: " + isSorted);
    }

    public static boolean isSortedDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false; // Якщо знайдено пару, де елемент менший за наступний, то масив не є в упорядкованому порядку за спаданням.
            }
        }
        return true; // Якщо не знайдено жодної пари, де елемент менший за наступний, то масив є в упорядкованому порядку за спаданням.
    }
}

