import modules.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>();
        personArrayList.add(new Student("ringo","starr",2.5));
        personArrayList.add(new Student("john","Lennon",3.5));
        personArrayList.add(new Employee("George","Harrison","cashier",50000));
        personArrayList.add(new Employee("Paul","McCartney","taxir",25000));
        printData(personArrayList);
    }
    public static void printData(Iterable<Person> array) {
        Comparator<Person> incomeComparator = Comparator.comparingDouble(Person::getPaymentAmount);
        ArrayList<Person> sortedArray = new ArrayList<Person>((Collection) array);
        sortedArray.sort(incomeComparator);
        for (Person person : sortedArray) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount());
        }
    }
}