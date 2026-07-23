package ir.javacup.NoteManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NoteManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your lastname: ");
        String lastname = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your level of study: ");
        String level = scanner.nextLine();

        System.out.print("Enter your birthday: ");
        String birthday = scanner.nextLine();

        String filePath = "src/ir/javacup/NoteManager/user_info.txt";
        File file = new File(filePath);

        file.getParentFile().mkdirs();

        try (FileWriter writer = new FileWriter(file)) {
            writer.write("Name: " + name + "\n");
            writer.write("Lastname: " + lastname + "\n");
            writer.write("Age: " + age + "\n");
            writer.write("Level of Study: " + level + "\n");
            writer.write("Birthday: " + birthday + "\n");
            System.out.println("User information saved successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to file.");
            e.printStackTrace();
        }

        try (Scanner fileReader = new Scanner(file)) {
            while (fileReader.hasNextLine()) {
                System.out.println(fileReader.nextLine());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading file.");
            e.printStackTrace();
        }

        scanner.close();
    }
}