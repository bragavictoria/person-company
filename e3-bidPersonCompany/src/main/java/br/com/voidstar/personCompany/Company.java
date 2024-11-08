package br.com.voidstar.personCompany;

import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;

public class Company {
    private String name;
    private List<Person> employees = new ArrayList<>();

    public Company() {
        this.name = "";
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfEmployees() {
        return employees.size();
    }

    public void hire(Person person, double salary) {
        if (person != null && salary > 0) {
            if (person.getCompany() != null && person.getCompany() != this) {
                person.getCompany().dismiss(person);
            }
            if (!employees.contains(person)) {
                person.selfHire(this, salary);
                employees.add(person);
            }
//            else {
//                person.setSalary(salary);
//            }
        }
    }

    public void dismiss(Person person) {
        if (employees.contains(person)) {
            person.selfDismiss(this);
            employees.remove(person);
            person.setSalary(0.0);
        }
    }

    public boolean employed(Person person) {
        return employees.contains(person) && person.getCompany() == this;
    }

    public double payroll() {
        double total = 0.0;
        for (Person person : employees){
            total += person.getSalary();
        }
        return total;
    }
}
