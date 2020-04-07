package com.utn.enunciado1;

public class ESalaried extends Employee {
    private double basicSalary;
    private int yearsWorked;

    public ESalaried() {
        super();
    }

    public ESalaried(int dni, String nombre, String apellido, int firstYear, double basicSalary) {
        super(dni, nombre, apellido, firstYear);
        this.basicSalary = basicSalary;
        yearsWorked = 0;
    }


    public int getYearsWorked() {
        return yearsWorked;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double getSalary() {
        double bonusSalary;
        if (yearsWorked == 2 || yearsWorked <= 3) bonusSalary = 1.05;
        else if (yearsWorked >= 4 || yearsWorked <= 7) bonusSalary = 1.10;
        else if (yearsWorked >= 8 || yearsWorked <= 15) bonusSalary = 1.15;
        else if (yearsWorked >= 15) bonusSalary = 1.20;
        else bonusSalary = 0;
        return ((bonusSalary * this.basicSalary) + basicSalary);
    }
}
