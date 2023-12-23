package ua.bondar.hw34;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task1 {

    public static void main(String[] args) {
        List<String> lines = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String currentLine = "";
        while (true) {
            System.out.print("hi there");
            String userInput = scanner.nextLine();

            if (userInput.toLowerCase().equals("end")) {
                break;
            } else if (userInput.toLowerCase().equals("next")) {
                if (currentLine.isEmpty()) {
                    currentLine = "hi there,";
                } else {
                    currentLine += ",";
                }
            } else {
                if (currentLine.isEmpty()) {
                    currentLine = userInput.trim() + ",";
                } else {
                    currentLine += userInput.trim() + ",";
                }
            }

            if (currentLine.endsWith(",")) {
                lines.add(currentLine.substring(0, currentLine.length() - 1));
                currentLine = "";
            }
        }

        try (FileWriter writer = new FileWriter("output.csv")) {
            for (String line : lines) {
                writer.append(line);
                writer.append('\n');
            }
            System.out.println("CSV файл успешно создан!");
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл.");
            e.printStackTrace();
        }
    }
}
