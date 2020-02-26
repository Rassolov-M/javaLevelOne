package homework5_1;

public class Person {
    private String fio;
    private String position;
    private String email;
    private String phone;
    private double salary;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public Person(String fio, String position, String email, String phone, double salary, int age){
        this.fio = fio;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this. salary = salary;
        this.age = age;
    }

    public void personInfo(){

        System.out.printf("ФИО Сотрудника: " + fio + "\nдолжность: " + position + "\nEmail: " + email + "\nТелефон: " + phone + "\nзарплата: " + salary + "\nВозраст: " + age + "\n");
    }



}
