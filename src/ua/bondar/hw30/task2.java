package ua.bondar.hw30;

public class task2 {
    @FunctionalInterface
    interface Pow {
        int pow(int number, int exponent);
    }

    public static void main(String[] args) {
        // Используем лямбда-выражение для реализации интерфейса Pow
        Pow powOperation = (number, exponent) -> {
            int result = 1;
            for (int i = 0; i < exponent; i++) {
                result *= number;
            }
            return result;
        };

        // Пример использования
        int base = 2;
        int power = 3;

        int result = powOperation.pow(base, power);
        System.out.println(base + " в степени " + power + " равно " + result);
    }
}
