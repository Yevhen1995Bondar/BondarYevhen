package ua.bondar.hw28;

public class Phone {
    private String number;
    private String model;
    private double weight;

    // Конструктор с тремя параметрами
    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // Конструктор с двумя параметрами
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        this.weight = 0;
    }

    // Конструктор без параметров
    public Phone() {
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
        // Создаем три экземпляра класса Phone
        Phone phone1 = new Phone("123456789", "Samsung", 150.0);
        Phone phone2 = new Phone("987654321", "iPhone");
        Phone phone3 = new Phone();

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
