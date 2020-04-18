/*Написать программу которая будет записывать Ф.И.О. студентов в файл.
1. Если файла списка студентов еще нет - он должен быть создан автоматически
2. Добавить возможность добавлять студентов в файл таким образом, чтоб к существующему списку был добавлен новый студент.
3. Если студент с такой фамилией есть он не добавляется в файл*/

package HW3;

import java.io.*;
import java.util.Scanner;

public class StudentsList {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Ввведите ФИО нового студента: ");
        String name = scanner.next();
        scanner.close();
        String pathname = "student_list.txt";

        File file = new File(pathname);

        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.equalsIgnoreCase(name)) {
                    System.out.print("Такой студент уже есть.");
                    return;
                }
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        try {
            FileWriter writer = new FileWriter(pathname, true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write("\n"+name);
            System.out.print(name + " успешно добавлен в список студентов.");
            bufferWriter.close();
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
