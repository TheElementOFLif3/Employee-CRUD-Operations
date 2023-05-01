package com.employeeapp;

public class Employee {
    private int id;
    private String name;
    private String adresses;
    private int age;
    private double salary;

    public Employee() {

    }

public Employee(int id, String name, String adresses, int age, double salary) {
        this.id = id;
        this.name = name;
        this.adresses = adresses;
        this.age = age;
        this.salary = salary;
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresses() {
        return adresses;
    }

    public void setAdresses(String adresses) {
        this.adresses = adresses;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", adresses='" + adresses + '\'' +
                ", age='" + age +
                ", salary='" + salary +
                '}';
    }
}
