public class Manager {
    String firstname;
    String patronymic;
    String lastname;
    String position;
    String email;
    String cellNumber;
    String salary;
    int age;


    Manager(String firstname, String patronymic, String lastname, String position, String email, String cellNumber, String salary, int age){
        this.firstname = firstname;
        this.patronymic = patronymic;
        this.lastname = lastname;
        this.position = position;
        this.email = email;
        this.cellNumber = cellNumber;
        this.salary = salary;
        this.age = age;
    }

    void printInfo()
    {
        System.out.println("ФИО: " + firstname + patronymic + lastname);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + email);
        System.out.println("Номер телефона: " + cellNumber);
        System.out.println("Зарплата: " + salary);
        System.out.println("Возраст: " + age);
    }
}