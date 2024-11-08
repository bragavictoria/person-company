package br.com.voidstar.personCompany;

public class Person {
    private String name;
    private String surname;
    private double salary;
    private Company company;

    public Person() {
       this.name = "";
       this.surname = "";
       this.company = null;
       this.salary = 0.0;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.salary = 0.0;
        this.company = null;
    }
    public Person(String name, String surname, double salary, Company company) {
        this.name = name;
        this.surname = surname;
        this.salary = 0.0;
        this.company = null;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public Company getCompany(){
        return company;
    }

    public void selfHire(Company company, double salary) {
        if (company != null && this.company == null) {
            this.salary = salary;
            this.company = company;
        }
    }

        public void selfDismiss (Company company){
            if (this.company == company) {
                this.salary = 0.0;
                this.company = null;
            }
        }
    }