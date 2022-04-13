public class Employee {
    String FIO;
    String post;
    String email;
    String phoneNumber;
    int salary;
    int age;

    public int getAge() {
        return age;
    }
    public Employee(String FIO, String post, String email, String phoneNumber, int salary, int age) {
        this.FIO = FIO;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
    public void print() {
        System.out.println("ФИО: " + FIO + " | " + " Должность: " + post + " | " + " " +
                "email: " + email + " | " + " телефон: " + phoneNumber + " | " + " " +
                "зарплата: " + salary + " | " + " Возраст: " + age);
    }
}
