package com.utn.enunciado1;

public abstract class Employee {
    private int dni;
    private String name;
    private String lastname;
    private int firstYear;

    public Employee() {
    }

    public Employee(int dni, String name, String lastname, int firstYear) {
        this.dni = dni;
        this.firstYear = firstYear;
        this.name = name;
        this.lastname = lastname;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setFirstYear(int firstYear) {
        this.firstYear = firstYear;
    }

    public void printEmployee() {
        System.out.println("Dni = " + dni);
        System.out.println("Name = " + name);
        System.out.println("Lastname = " + lastname);
        System.out.println("FirstYear = " + firstYear);
    }

    public abstract double getSalary();
}
