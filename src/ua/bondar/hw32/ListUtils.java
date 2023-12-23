package ua.bondar.hw32;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public static int getSum(List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static List<Integer> getOddNumbers(List<Integer> numbers) {
        List<Integer> oddNumbers = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 != 0) {
                oddNumbers.add(number);
            }
        }
        return oddNumbers;
    }

    public static List<String> convertToStringList(List<Integer> numbers) {
        List<String> stringList = new ArrayList<>();
        for (Integer number : numbers) {
            stringList.add(String.valueOf(number));
        }
        return stringList;
    }

    public static List<String> doubling(List<String> strings) {
        List<String> doubledStrings = new ArrayList<>();
        for (String str : strings) {
            doubledStrings.add(str + str);
        }
        return doubledStrings;
    }

    public static void main(String[] args) {
        // Пример использования методов
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println("Sum: " + getSum(numbers));

        List<Integer> oddNumbers = getOddNumbers(numbers);
        System.out.println("Odd Numbers: " + oddNumbers);

        List<String> stringList = convertToStringList(numbers);
        System.out.println("String List: " + stringList);

        List<String> doubledStrings = doubling(stringList);
        System.out.println("Doubled Strings: " + doubledStrings);
    }
}
