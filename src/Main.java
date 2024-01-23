import modules.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList = new ArrayList<>(); // creating an array containing students and employees
        // adding students and employees
        personArrayList.add(new Student("ringo","starr",2.5));
        personArrayList.add(new Student("john","Lennon",3.5));
        personArrayList.add(new Employee("George","Harrison","cashier",50000));
        personArrayList.add(new Employee("Paul","McCartney","taxir",25000));
        printData(personArrayList); // printing income by ascending order
    }
    public static void printData(Iterable<Person> array) {
        Comparator<Person> incomeComparator = Comparator.comparingDouble(Person::getPaymentAmount); // create a custom comparing function
        ArrayList<Person> sortedArray = new ArrayList<Person>((Collection) array); // creating a copy
        sortedArray.sort(incomeComparator); // sorting copy
        for (Person person : sortedArray) {
            System.out.println(person.toString() + " earns " + person.getPaymentAmount()); // printing
        }
    }
}