package modules;

public class Student extends Person{
    private double gpa;
    // constructors
    public Student() {
        super();
    }
    public Student(String name, String surname, double gpa) {
        super(name,surname);
        this.gpa = gpa;
    }
    // getter and setter
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student: " + getId() +
                ". " + getName() +
                ' ' + getSurname();
    }
    // implementing an abstract method for student
    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36600;
        } else {
            return 0;
        }
    }
}