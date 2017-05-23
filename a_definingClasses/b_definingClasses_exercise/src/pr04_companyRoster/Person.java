package pr04_companyRoster;

public class Person {
    public static final String N_A = "n/a";
    public static final int DEFAULT_AGE = -1;

    private String name;
    private double salary;
    private String position;
    private String department;
    private String email;
    private int age;

    public Person(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
        this.email= N_A;
        this.age= DEFAULT_AGE;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d",this.name,this.salary,this.email,this.age);
    }
}
