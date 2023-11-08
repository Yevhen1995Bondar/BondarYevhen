package ua.bondar.hw23;

public class DZ_23_Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        System.out.println("До обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Обмін значень без прямого присвоєння
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Після обміну:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
