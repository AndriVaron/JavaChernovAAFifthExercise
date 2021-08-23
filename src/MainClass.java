public class MainClass {
    public static void main(String[] args) {
        Manager firstManager = new Manager("Альберт", "Альбертович", "Альтов", "Директор", "albert@gmail.com", "89112223344", "3000$", 56);
//        firstManager.firstname = "Альберт";
//        firstManager.patronymic = "Альбертович";
//        firstManager.lastname = "Альтов";
//        firstManager.position = "Директор";
//        firstManager.email = "albert@gmail.com";
//        firstManager.cellNumber = "89112223344";
//        firstManager.salary = "3000$";
//        firstManager.age = 34;

        Manager secondManager = new Manager("Василий", "Васильевич", "Васьков", "Зам.Директора", "vasa@mail.ru", "891122334456", "2500$", 29);
        System.out.println("ФИО: " + firstManager.firstname + " " + firstManager.patronymic + " " + firstManager.lastname + "\nДолжность: " + firstManager.position + "\nПочта: " + firstManager.email + "\nНомер телефона: " + firstManager.cellNumber + "\nЗарплата: " + firstManager.salary + "\nВозраст: " + firstManager.age + "\n");
        System.out.println("ФИО: " + secondManager.firstname + " " + secondManager.patronymic + " " + secondManager.lastname + "\nДолжность: " + secondManager.position + "\nПочта: " + secondManager.email + "\nНомер телефона: " + secondManager.cellNumber + "\nЗарплата: " + secondManager.salary + "\nВозраст: " + secondManager.age+ "\n");


        Manager[] managersArrays = new Manager[5]; // Вначале объявляем массив объектов
        managersArrays[0] = new Manager("Иван", "Иванов", "Иванович", "Служащий", "ivan@mail.ru", "891122334457)", "1000$", 20);
        managersArrays[1] = new Manager("Иван", "Иванов", "Иванович", "Служащий", "ivan@mail.ru", "891122334457)", "1000$", 45);
        managersArrays[2] = new Manager("Иван", "Иванов", "Иванович", "Служащий", "ivan@mail.ru", "891122334457)", "1000$", 200);
        managersArrays[3] = new Manager("Иван", "Иванов", "Иванович", "Служащий", "ivan@mail.ru", "891122334457)", "1000$", 32);
        managersArrays[4] = new Manager("Иван", "Иванов", "Иванович", "Служащий", "ivan@mail.ru", "891122334457)", "1000$", 50);


        int minAge = 40;
        for (Manager employee : managersArrays) {
            if (employee.age > minAge) {
                employee.printInfo();
                System.out.println();
            }
        }
    }
}
