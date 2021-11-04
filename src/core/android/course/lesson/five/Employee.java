package core.android.course.lesson.five;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public float getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, String position, String email, String phone, float salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printToConsole() {
        System.out.printf("Employee: name - %s position - %s email - %s phone - %s salary - %f age - %d\n", name, position, email, phone, salary, age);
    }
}
