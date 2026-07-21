package com.employee.main;

import java.util.Scanner;

import com.employee.dao.AdminDAO;
import com.employee.dao.EmployeeDAO;
import com.employee.model.Employee;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        AdminDAO adminDAO = new AdminDAO();
        EmployeeDAO employeeDAO = new EmployeeDAO();

        System.out.println("====================================");
        System.out.println("   EMPLOYEE MANAGEMENT SYSTEM");
        System.out.println("====================================");

        System.out.print("Enter Username : ");
        String username = sc.nextLine();

        System.out.print("Enter Password : ");
        String password = sc.nextLine();

        if (adminDAO.login(username, password)) {

            System.out.println("\nLogin Successful...\n");

            int choice;

            do {

                System.out.println("\n====================================");
                System.out.println("1. Add Employee");
                System.out.println("2. View Employees");
                System.out.println("3. Search Employee");
                System.out.println("4. Update Employee Salary");
                System.out.println("5. Delete Employee");
                System.out.println("6. Logout");
                System.out.print("Enter Choice : ");

                choice = sc.nextInt();
                sc.nextLine();

                switch (choice) {

                case 1:

                    Employee emp = new Employee();

                    System.out.print("Enter Name : ");
                    emp.setName(sc.nextLine());

                    System.out.print("Enter Email : ");
                    emp.setEmail(sc.nextLine());

                    System.out.print("Enter Phone : ");
                    emp.setPhone(sc.nextLine());

                    System.out.print("Enter Department : ");
                    emp.setDepartment(sc.nextLine());

                    System.out.print("Enter Designation : ");
                    emp.setDesignation(sc.nextLine());

                    System.out.print("Enter Salary : ");
                    emp.setSalary(sc.nextDouble());
                    sc.nextLine();

                    System.out.print("Enter Joining Date (YYYY-MM-DD) : ");
                    emp.setJoiningDate(sc.nextLine());

                    employeeDAO.addEmployee(emp);
                    break;

                case 2:
                    employeeDAO.viewEmployees();
                    break;

                case 3:
                    System.out.print("Enter Employee ID : ");
                    int id = sc.nextInt();

                    employeeDAO.searchEmployee(id);
                    break;

                case 4:
                    System.out.print("Enter Employee ID : ");
                    int updateId = sc.nextInt();

                    System.out.print("Enter New Salary : ");
                    double salary = sc.nextDouble();

                    employeeDAO.updateEmployee(updateId, salary);
                    break;

                case 5:
                    System.out.print("Enter Employee ID : ");
                    int deleteId = sc.nextInt();

                    employeeDAO.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.println("Logout Successful...");
                    break;

                default:
                    System.out.println("Invalid Choice!");

                }

            } while (choice != 6);

        } else {

            System.out.println("Invalid Username or Password.");

        }

        sc.close();
    }
}