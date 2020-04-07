package com.utn.enunciado1;


public class Manager {
    private static Employee[] employeeFiles = new Employee[10];
    private static int i;

    public Manager() {
    }

    public static void setEmployeeFiles(Employee toArrayEmp) {
        employeeFiles[i] = toArrayEmp;
        ++i;
    }

    public static void sortMethod() {
        int i, j, pos;
        Employee[] tmp = new Employee[1];
        double menor, actual;
        for (i = 0; i < employeeFiles.length - 1 && employeeFiles[i] != null; i++) {
            menor = employeeFiles[i].getSalary();
            pos = i;
            for (j = i + 1; j < employeeFiles.length && employeeFiles[j] != null; j++) {
                actual = employeeFiles[j].getSalary();
                if (actual < menor) {
                    menor = actual;
                    pos = j;
                }
            }
            if (pos != i) {
                tmp[0] = employeeFiles[i];
                employeeFiles[i] = employeeFiles[pos];
                employeeFiles[pos] = tmp[0];
            }
        }
    }

    public void higherSalary() {
        //Employee[] dummy = new Employee[1];
        Employee dummy = null;
        double max = 0;
        int i = 0;
        sortMethod();
        while ((i < employeeFiles.length) && (employeeFiles[i] != null)) {
            //System.out.println(employeeFiles[i].getName());
            if (employeeFiles[i].getSalary() > max) {
                //dummy[0] = employeeFiles[i];
                dummy = employeeFiles[i];
                max = employeeFiles[i].getSalary();
            }
            i++;
        }
        System.out.println("HIGHER SALARY\nName     :" + dummy.getName() + "\nLastname :" + dummy.getLastname() + "\nSalary   :" + dummy.getSalary());
        System.out.println();
    }

    public void printeEmployeesFiles() {
        //for (Employee employeeFile : employeeFiles)
        int i = 0;
        System.out.println("EMPLOYEES.................:");
        while ((i <= employeeFiles.length) && (employeeFiles[i] != null)) {
            employeeFiles[i].printEmployee();
            System.out.println("=============" + (++i) + "=============");
        }
    }
}
