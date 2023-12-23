package ua.bondar.hw32;

import java.util.ArrayList;
import java.util.Iterator;

public class task1 {
    public static void main(String[] args) {
        // Создаем ArrayList и добавляем элементы
        ArrayList<String> list = new ArrayList<>();
        list.add("Item1");
        list.add("Item2");
        list.add("Item3");
        list.add("Item4");

        System.out.println("1. Использование цикла for:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("\n2. Использование цикла for-each:");
        for (String item : list) {
            System.out.println(item);
        }

        System.out.println("\n3. Использование цикла while:");
        int index = 0;
        while (index < list.size()) {
            System.out.println(list.get(index));
            index++;
        }

        System.out.println("\n4. Использование итератора:");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
