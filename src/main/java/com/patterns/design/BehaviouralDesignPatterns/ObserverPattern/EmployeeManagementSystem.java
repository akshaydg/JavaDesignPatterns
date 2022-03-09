package com.patterns.design.BehaviouralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {

    List<IObserver> observerList;
    EmployeeDAO employeeDAO = new EmployeeDAO();

    public void initIObserverList(){
        if(observerList==null){
            observerList = new ArrayList<>();
        }
    }

    public void notifyAllDepartments(){
        for(IObserver department : observerList){
            department.callMe();
        }
    }

    public void registerObserver(IObserver iObserver){
        initIObserverList();
        observerList.add(iObserver);
    }

    public void hireNewEmployee(Employee e){
        System.out.println("new Employee hired");
        employeeDAO.createEmployee(e);
        notifyAllDepartments();
    }

    public void modifyEmployee(int id, String name){
        System.out.println("Employee modified");
        employeeDAO.updateEmployee(id, name);
        notifyAllDepartments();
    }
}
