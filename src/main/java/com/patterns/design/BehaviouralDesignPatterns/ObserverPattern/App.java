package com.patterns.design.BehaviouralDesignPatterns.ObserverPattern;

public class App {
    public static void main(String[] args) {
        IObserver iObserver1 = new HRDepartment();
        IObserver iObserver2 = new PayrollDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();
        ems.registerObserver(iObserver1);
        ems.registerObserver(iObserver2);

//        Employee e = new Employee(5, "Akshay");
//        ems.hireNewEmployee(e);

        ems.modifyEmployee(3, "Praj");
    }
}
