package modules;

public abstract class Person implements Payable{
    private static int id_gen = 1;
    private final int id;
    private String name;
    private String surname;
    public Person() {
        id = id_gen++;
    }
    public Person(String name, String surname) {
        this();
        this.name = name;
        this.surname = surname;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return id + ". " + name + ' ' + surname;
    }
    public abstract double getPaymentAmount();
}
