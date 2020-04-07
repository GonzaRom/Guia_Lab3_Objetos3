package com.utn;

import com.utn.enunciado1.ECommission;
import com.utn.enunciado1.ESalaried;
import com.utn.enunciado1.Manager;

public class Main {

    public static void main(String[] args) {
        Manager manager = new Manager();

        //Initialization by constructor
        ESalaried javierG = new ESalaried(569587, "Javier", "Gomez", 2008, 1225.00);
        manager.setEmployeeFiles(javierG);
        ECommission evaNieto = new ECommission(695235, "Eva", "Nieto", 2010, 176, 8.10);
        manager.setEmployeeFiles(evaNieto);

        //Initialization by setters
        ECommission joseRuiz = new ECommission();
        joseRuiz.setClients(81);
        joseRuiz.setCommission(7.90);
        joseRuiz.setName("Jose");
        joseRuiz.setLastname("Ruiz");
        joseRuiz.setDni(74258);
        manager.setEmployeeFiles(joseRuiz);

        ESalaried mariaN = new ESalaried();
        mariaN.setName("Maria");
        mariaN.setLastname("Nuñez");
        mariaN.setDni(896325);
        mariaN.setFirstYear(2013);
        mariaN.setBasicSalary(1155);
        manager.setEmployeeFiles(mariaN);

        //Print the employee whit the higher salary.
        manager.higherSalary();

        //Print All the employees
        manager.printeEmployeesFiles();


    }
}
