package pr2_salaryIncrease;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }


    public void increaseSalary(int bonus) {
        if (this.age < 30) {
            this.salary += this.salary * ((0.5 * bonus) /100);
        } else {
            this.salary += this.salary * bonus / 100;
        }
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName + " get " + this.salary + " leva";
    }
}
