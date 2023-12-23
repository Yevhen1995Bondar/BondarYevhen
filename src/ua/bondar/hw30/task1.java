package ua.bondar.hw30;

public class task1 {

    abstract static class Student {
        private String firstName;
        private String lastName;
        private String group;
        private double averageMark;

        public Student(String firstName, String lastName, String group, double averageMark) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.group = group;
            this.averageMark = averageMark;
        }

        public double getAverageMark() {
            return averageMark;
        }

        public static int getScholarship(double averageMark) {
            return (averageMark == 5) ? 100 : 80;
        }

        public abstract int getScholarship();  // Абстрактный метод без реализации
    }

    static class Aspirant extends Student {
        private String scientificWork;

        public Aspirant(String firstName, String lastName, String group, double averageMark, String scientificWork) {
            super(firstName, lastName, group, averageMark);
            this.scientificWork = scientificWork;
        }

        @Override
        public int getScholarship() {
            return (super.getAverageMark() == 5) ? 200 : 180;
        }
    }

    public static void main(String[] args) {
        // Нельзя создать экземпляр абстрактного класса
        // Student student = new Student("John", "Doe", "GroupA", 4.5);

        Aspirant aspirant = new Aspirant("Jane", "Doe", "GroupB", 5, "Research on AI");

        Student[] students = {aspirant};  // Массив типа Student теперь содержит Aspirant

        for (Student s : students) {
            System.out.println(s.getScholarship());
        }
    }
}
