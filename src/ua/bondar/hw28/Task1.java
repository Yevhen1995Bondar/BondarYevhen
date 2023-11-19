package ua.bondar.hw28;

public class Task1 {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Task1(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Task1(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    // Конструктор без параметров
    public Task1() {
        this.number = "Unknown";
        this.model = "Unknown";
        this.weight = 0;
    }

    // Метод receiveCall
    public void receiveCall(String callerName) {
        System.out.println("Звонит " + callerName);
    }

    // Метод getNumber
    public String getNumber() {
        return number;
    }

    public static void main(String[] args) {
        // Создаем три экземпляра класса Task1
        Task1 phone1 = new Task1("123456789", "Samsung", 150.0);
        Task1 phone2 = new Task1("987654321", "iPhone");
        Task1 phone3 = new Task1();

        // Присваиваем значения полям класса
        phone2.weight = 200.0;
        phone3.number = "555555555";
        phone3.model = "Nokia";

        // Выводим на консоль значения полей
        System.out.println("Phone 1 - Number: " + phone1.getNumber() + ", Model: " + phone1.model + ", Weight: " + phone1.weight);
        System.out.println("Phone 2 - Number: " + phone2.getNumber() + ", Model: " + phone2.model + ", Weight: " + phone2.weight);
        System.out.println("Phone 3 - Number: " + phone3.getNumber() + ", Model: " + phone3.model + ", Weight: " + phone3.weight);

        // Вызываем методы receiveCall и getNumber для каждого объекта
        phone1.receiveCall("Alice");
        System.out.println("Phone 1 Number: " + phone1.getNumber());

        phone2.receiveCall("Bob");
        System.out.println("Phone 2 Number: " + phone2.getNumber());

        phone3.receiveCall("Charlie");
        System.out.println("Phone 3 Number: " + phone3.getNumber());
    }
}
