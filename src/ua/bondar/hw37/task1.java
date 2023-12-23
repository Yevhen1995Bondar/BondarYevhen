package ua.bondar.hw37;


    import java.lang.reflect.Field;

    public class task1 {
        public static void main(String[] args) {
            // Создаем экземпляр класса A с использованием рефлексии
            A instance = createInstance(A.class);

            // Выводим состояние объекта до изменения
            System.out.println("Before modification: " + instance);

            // Изменяем значения переменных
            modifyFields(instance, "456", "B");

            // Выводим состояние объекта после изменения
            System.out.println("After modification: " + instance);
        }

        // Метод для создания экземпляра класса с приватным конструктором
        private static <T> T createInstance(Class<T> clazz) {
            try {
                // Получаем приватный конструктор
                var constructor = clazz.getDeclaredConstructor();
                // Разрешаем доступ к приватному конструктору
                constructor.setAccessible(true);
                // Создаем экземпляр класса
                return constructor.newInstance();
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }

        // Метод для изменения значений переменных объекта
        private static void modifyFields(Object obj, String newId, String newName) {
            try {
                // Получаем все поля класса
                Field idField = obj.getClass().getDeclaredField("id");
                Field nameField = obj.getClass().getDeclaredField("name");

                // Разрешаем доступ к приватным полям
                idField.setAccessible(true);
                nameField.setAccessible(true);

                // Изменяем значения полей
                idField.set(obj, newId);
                nameField.set(obj, newName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    class A {
        private String id = "123";
        private String name = "A";

        private A() {
        }

        @Override
        public String toString() {
            return "A{" +
                    "id='" + id + '\'' +
                    ", name='" + name + '\'' +
                    '}';
        }
    }


