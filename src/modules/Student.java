package modules;

public class Student extends Person{
    private double gpa;

    public Student() {
        super();
    }
    public Student(String name, String surname, double gpa) {
        super(name,surname);
        this.gpa = gpa;
    }
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

    public double getPaymentAmount() {
        if (gpa > 2.67) {
            return 36600;
        } else {
            return 0;
        }
    }
}