/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author Sudheer Reddy Gaddam
 */
public class EmployeeDirectory {
    
    private ArrayList<Employee> employeeList;

    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee createEmployeeForPanel(String name,String address, long phone){
        Employee employee = new Employee();
        employee.setName(name);
        employee.setPhone(phone);
        employee.setAddress(address);
        
        employeeList.add(employee);
        return employee;
    }
}
