package org.example.composite;

import java.util.ArrayList;
import java.util.List;

public class HRManager implements Employee{
    private String name;
    private Double salary;
    private List<Employee> employees;

    public HRManager(String name, Double salary){
        this.name = name;
        this.salary = salary;
        this.employees = new ArrayList<>();
    }

    public void hireNewEmployee(Employee employee){
        employees.add(employee);
    }

    public void fireEmployee(Employee employee){
        employees.remove(employee);
    }

    public void getEmployeesInfo(){
        for(Employee employee : employees){
            employee.getInfo();
        }
    }

    @Override
    public void work(){
        System.out.println("I am handling employees");
    }
    @Override
    public void getInfo(){
        System.out.println("My name is " + name + " and my salary is " + salary);
    }
}
