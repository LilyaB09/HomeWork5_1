public class HomeWork5_1 {
    public static void main(String[] args) {
        Employee[] employeeArray = new Employee[5];
        employeeArray[0] =
                new Employee(
                        "Ivanov Stanislav Ivanovich",
                        "java_developer",
                        "qwerty@gmail.com",
                        "7912748",
                        50000,
                        42);

        employeeArray[1] =
                new Employee(
                        "Sergeev Sergey Sergeevich",
                        "Programmist",
                        "asdfg@gmail.com",
                        "7912643",
                        75000,
                        36);

        employeeArray[2] =
                new Employee(
                        "Petrov Petr Pettrovich",
                        "QA-Engineer",
                        "zxcvb@gmail.com",
                        "7912741",
                        55000,
                        38);

        employeeArray[3] =
                new Employee(
                        "Alexandrov Alexander Alexsovich",
                        "Java Developer",
                        "lkjhg@gmail.com",
                        "7912644",
                        60000,
                        40);

        employeeArray[4] =
                new Employee(
                        "Sergeev Sergey Mihailovich",
                        "Programmist",
                        "mnbvcg@gmail.com",
                        "7912648",
                        70000,
                        46);

        for (int i = 0; i < employeeArray.length; i++) {
            if (employeeArray[i].getAge() > 40) {
                employeeArray[i].print();
            }
        }
    }
}

