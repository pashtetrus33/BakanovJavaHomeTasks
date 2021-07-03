public class StaffMember {

    private String fullName;
    private String position;
    private String email;
    private String phone;
    private float salary;
    private int age;

    public StaffMember () {
        this.fullName = "Иванов Иван Иванович";
        this.position = "инженер";
        this.email = "ivanov@company.com";
        this.phone = "+79601235678";
        this.salary = 45000.00f;
        this.age = 45;
    }

    public StaffMember (String fullName, String position, String email, String phone, float salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void info() {
        System.out.println ("ФИО: " + fullName);
        System.out.println ("Должность: " + position);
        System.out.println ("Email: " + email);
        System.out.println ("Телефон: " + phone);
        System.out.println ("Зарплата: " + salary);
        System.out.println ("Возраст: " + age + "лет");
    }
}
