package ua.bondar.hw31;

public class task1 {
    public static void main(String[] args) {
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Поймано исключение: " + e.getMessage());
        } finally {
            System.out.println("Блок finally выполнен.");
        }
    }

    private static void throwException() throws Exception {
        throw new Exception("Пример исключения с передачей аргумента String");
    }
}
