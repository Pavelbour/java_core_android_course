package core.android.course.lesson.five;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        String[] names = {"Retya", "Vasya", "Sveta", "Nadya", "Vitya", "Vica"};
        String[] positions = {"driver", "developer", "manager", "accountant", "loader", "cleaner", "salesperson", "seamstress"};

        Employee[] employees = new Employee[5];
        for (int i = 0; i < employees.length; i++) {
            String name = names[random.nextInt(names.length)];
            String position = positions[random.nextInt(positions.length)];
            String email = name + "@gmail.com";
            String phone = "+5 (555)  555-55-55";
            float salary = random.nextInt(160000) + 20000;
            int age = random.nextInt(54) + 21;
            employees[i] = new Employee(name, position, email, phone, salary, age);
        }

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) employees[i].printToConsole();
        }
    }
}
