package com.employeeapp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoInterf dao = new EmployeeDaoImpl();
        System.out.println("Welcome to Employee App");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Create Employee\n" +
                    "2. Show All Employee\n" +
                    "3. Show Employee By Name\n" +
                    "4. Update Employee\n" +
                    "5. Delete Employee\n");
            System.out.println("Enter your choice : ");

            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter Employee Id : ");
                    int id;
                    while (true) {
                        try {
                            id = sc.nextInt();
                            break;
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input. Please enter an integer for ID.");
                            sc.next();
                        }
                    }
                    System.out.println("Enter Employee Name : ");
                    String name = sc.next();
                    System.out.println("Enter Employee Address : ");
                    String address = sc.next();
                    System.out.println("Enter Employee Age : ");
                    int age = sc.nextInt();
                    System.out.println("Enter Employee Salary : ");
                    double salary = sc.nextDouble();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setAdresses(address);
                    emp.setAge(age);
                    emp.setSalary(salary);
                    dao.createEmployee(emp);
                    break;
                case 2:
                    dao.showAllEmployee();
                    break;
                case 3:
                    System.out.println("Enter Employee Name: ");
                    name = sc.next();
                    dao.showEmployeeByName(name);

                    break;
                case 4:
                    System.out.println("Enter Id to update the details : ");
                    int empid1 = sc.nextInt();
                    System.out.println("Enter new name : ");
                    name = sc.next();
                    dao.updateEmployee(empid1, name);
                    break;
                case 5:
                    System.out.println("Enter Id to delete the details : ");
                    int idToDelete = sc.nextInt();
                    dao.deleteEmployee(idToDelete);
                    break;
                case 6:
                    System.out.println("Thank you for using Employee App");
                    System.exit(0);
                default:
                    System.out.println("Enter valid choice !");
                    break;
            }
        } while (true);
    }
}
