package albakag.com.company;


    //Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
public class Employee {

    private String fio;
    private String rang;
    private String email;
    private String phone;
    private double salary;
    private int age;

    //Конструктор класса должен заполнять эти поля при создании объекта;
    public Employee(String fio, String rang, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.rang = rang;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    //Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
    public void showInfo() {
        System.out.println("ФИО: " + fio + "\n" + "Возраст: " + age + "\n" + "Должность: " + rang + "\n"
                + "Почтовый адрес: " + email + "\n" + "Телефонный номер: " + phone + "\n" + "Зарплата: " + salary);
    }

    //field of getter'r & setter's
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
