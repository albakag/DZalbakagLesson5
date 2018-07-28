package albakag.com.company;

public class Main {

    private final static int PERSONS = 5;


    public static void main(String[] args) {

        //Создать массив из 5 сотрудников
        Employee [] employees = new Employee[PERSONS];
        employees [0] = new Employee("Ivanov Vanya", "Technical specialist", "ivivan@mailbox.com", "892312312", 45000, 50);
        employees [1] = new Employee("Petrov Petya", "Sale manager", "petropet@mailbox.com", "8924654", 25000, 35);
        employees [2] = new Employee("Sobolev Vasya", "Support specialist", "sobolvas@mailbox.com", "892524166", 25000, 28);
        employees [3] = new Employee("Havansky Misha", "Engineer", "havamih@mailbox.com", "895422364", 40000, 41);
        employees [4] = new Employee("Serova Sveta", "Santechnik", "serkabelka@mailbox.com", "8954722365", 20000, 27);

        //Вывод сотрудников возрастом старше 40 лет
        for (int i = 0; i < employees.length; i++) {
            int ageRange = 40;
            if (employees[i].getAge() > ageRange) {
                employees[i].showInfo();
                System.out.println("_____________________________");
            }
        }
    }
}
