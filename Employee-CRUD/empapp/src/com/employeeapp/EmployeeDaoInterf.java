package com.employeeapp;

public interface EmployeeDaoInterf {

    public void createEmployee(Employee emp);
    public void showAllEmployee();
    public void showEmployeeByName(String name);
    public void updateEmployee(int id,String name);
    public void deleteEmployee(int id);


}
