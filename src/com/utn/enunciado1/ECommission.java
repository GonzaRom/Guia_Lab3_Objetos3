package com.utn.enunciado1;

public class ECommission extends Employee {
    private int clients;
    private double commission;
    private double basicSalary;

    public static final double BASICSALARY = 750.0; ///Is a constant for all the E. Commission.

    public ECommission() {
        super();
    }

    public ECommission(int dni, String nombre, String apellido, int firstYear,int clients, double commission) {
        super(dni, nombre, apellido, firstYear);
        this.clients = clients;
        this.commission = commission;
        this.basicSalary = BASICSALARY;
    }

    @Override
    public double getSalary() {
        return ((commission * clients) + basicSalary);
    }


    public int getClients() {
        return clients;
    }

    public void setClients(int clients) {
        this.clients = clients;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getBasicSalary() {
        return basicSalary;
    }


   }
