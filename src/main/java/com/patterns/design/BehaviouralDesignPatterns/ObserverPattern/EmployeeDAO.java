package com.patterns.design.BehaviouralDesignPatterns.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    private List<Employee> employeeList= new ArrayList<>();;
    private static int counter =1;

    public EmployeeDAO(){
        employeeList.add(new Employee(counter++, "Amar"));
        employeeList.add(new Employee(counter++, "Akhbar"));
        employeeList.add(new Employee(counter++, "Anthony"));
        employeeList.add(new Employee(counter++, "Mukesh"));
    }

    public void createEmployee(Employee e){
        employeeList.add(e);
    }

    public List<Employee> getEmployees(){
        return employeeList;
    }

    public Employee getEmployee(int id){
        for (Employee e : employeeList){
            if(e.getId()==id){
                return e;
            }
        }
        return null;
    }

    public Employee updateEmployee(int id, String name){
        for (Employee e : employeeList){
            if(e.getId()==id){
                e.setId(id);
                e.setName(name);
                return e;
            }
        }
        return null;
    }

    public boolean deleteEmployee(int id){
        return employeeList.removeIf(e -> e.getId() == id);
    }

    public boolean deleteEmployee(Employee e){
        return employeeList.remove(e);
    }

}
