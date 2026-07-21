package com.employee.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.employee.connection.DBConnection;
import com.employee.model.Employee;

public class EmployeeDAO {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    // Add Employee
    public void addEmployee(Employee emp) {

        try {

            con = DBConnection.getConnection();

            String sql = "INSERT INTO employee(name,email,phone,department,designation,salary,joining_date) VALUES(?,?,?,?,?,?,?)";

            ps = con.prepareStatement(sql);

            ps.setString(1, emp.getName());
            ps.setString(2, emp.getEmail());
            ps.setString(3, emp.getPhone());
            ps.setString(4, emp.getDepartment());
            ps.setString(5, emp.getDesignation());
            ps.setDouble(6, emp.getSalary());
            ps.setString(7, emp.getJoiningDate());

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Employee Added Successfully...");
            } else {
                System.out.println("Employee Not Added.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // View Employees
    public void viewEmployees() {

        try {

            con = DBConnection.getConnection();

            String sql = "SELECT * FROM employee";

            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {

                System.out.println("-----------------------------------------");
                System.out.println("ID           : " + rs.getInt("id"));
                System.out.println("Name         : " + rs.getString("name"));
                System.out.println("Email        : " + rs.getString("email"));
                System.out.println("Phone        : " + rs.getString("phone"));
                System.out.println("Department   : " + rs.getString("department"));
                System.out.println("Designation  : " + rs.getString("designation"));
                System.out.println("Salary       : " + rs.getDouble("salary"));
                System.out.println("Joining Date : " + rs.getString("joining_date"));
                System.out.println("-----------------------------------------");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Search Employee
    public void searchEmployee(int id) {

        try {

            con = DBConnection.getConnection();

            String sql = "SELECT * FROM employee WHERE id=?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("-----------------------------------------");
                System.out.println("ID           : " + rs.getInt("id"));
                System.out.println("Name         : " + rs.getString("name"));
                System.out.println("Email        : " + rs.getString("email"));
                System.out.println("Phone        : " + rs.getString("phone"));
                System.out.println("Department   : " + rs.getString("department"));
                System.out.println("Designation  : " + rs.getString("designation"));
                System.out.println("Salary       : " + rs.getDouble("salary"));
                System.out.println("Joining Date : " + rs.getString("joining_date"));
                System.out.println("-----------------------------------------");

            } else {

                System.out.println("Employee Not Found.");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Update Employee Salary
    public void updateEmployee(int id, double salary) {

        try {

            con = DBConnection.getConnection();

            String sql = "UPDATE employee SET salary=? WHERE id=?";

            ps = con.prepareStatement(sql);

            ps.setDouble(1, salary);
            ps.setInt(2, id);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Employee Updated Successfully...");
            } else {
                System.out.println("Employee Not Found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        try {

            con = DBConnection.getConnection();

            String sql = "DELETE FROM employee WHERE id=?";

            ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            int i = ps.executeUpdate();

            if (i > 0) {
                System.out.println("Employee Deleted Successfully...");
            } else {
                System.out.println("Employee Not Found.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}