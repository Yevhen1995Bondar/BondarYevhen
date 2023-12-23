package ua.bondar.hw31;

public class task2 {
    public static void main(String[] args) {
        try {
            f();
        } catch (Exception e) {
            System.out.println("Поймано исключение в методе main: " + e.getMessage());
        }
    }

    private static void f() throws AnotherException {
        try {
            g();
        } catch (CustomException e) {
            // Перехватываем исключение из метода g() и выбрасываем новое исключение
            throw new AnotherException("Исключение в методе f", e);
        }
    }

    private static void g() throws CustomException {
        // Выбрасываем исключение в методе g()
        throw new CustomException("Исключение в методе g");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

class AnotherException extends Exception {
    public AnotherException(String message, Throwable cause) {
        super(message, cause);
    }
}

