package modules;

public class Employee extends Person{
    private String position;
    private double salary;
    // constructors
    public Employee() {
        super();
    }
    public Employee(String name, String surname, String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }
    // getter and setter
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee: " + getId() +
                ". " + getName() +
                ' ' + getSurname();
    }
    // implementing abstract method for employee
    public double getPaymentAmount() {
        return salary;
    }
}