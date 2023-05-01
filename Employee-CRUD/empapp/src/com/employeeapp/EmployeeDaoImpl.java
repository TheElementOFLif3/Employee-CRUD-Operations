package com.employeeapp;

import java.sql.*;

public class EmployeeDaoImpl implements EmployeeDaoInterf {
    Connection con;

    @Override
    public void createEmployee(Employee emp) {
        con = DBConnection.createDBConnection();
        String query = "insert into employee values(?,?,?,?,?)";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, emp.getId());
            pstm.setString(2, emp.getName());
            pstm.setString(3, emp.getAdresses());
            pstm.setInt(4, emp.getAge());
            pstm.setDouble(5, emp.getSalary());
            int cnt = pstm.executeUpdate();
            if (cnt != 0)
                System.out.println("Employee Created Successfully !");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void showAllEmployee() {
        con = DBConnection.createDBConnection();
        String query = "select * from employee";
        System.out.println("Employee Details : ");
        System.out.println("-------------------------------------------------");

        System.out.format("%s\t%s\t%s\t%s\t%s\n",
                "Id", "Name", "Address", "Age", "Salary");
        System.out.println("-------------------------------------------------");

        try {
            Statement stm = con.createStatement();
            ResultSet result = stm.executeQuery(query);
            while (result.next()) {
                System.out.format("%d\t%s\t%s\t%d\t%f\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getInt(4),
                        result.getDouble(5));
                System.out.println("-------------------------------------------------");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void showEmployeeByName(String name) {
        con = DBConnection.createDBConnection();
        String query = "select * from employee where name=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, name);
            ResultSet result = pstm.executeQuery();
            while (result.next()) {
                System.out.format("%d\t%s\t%s\t%d\t%f\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getString(3),
                        result.getInt(4),
                        result.getDouble(5));
                System.out.println("-------------------------------------------------");

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }


    @Override
    public void updateEmployee(int id, String name) {
        con = DBConnection.createDBConnection();
        String query = "update employee set name=? where id=?";
        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1, name);
            pstm.setInt(2, id);
            int cnt = pstm.executeUpdate();
            if (cnt != 0)
                System.out.println("Employee Updated Successfully !");

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }



    @Override
    public void deleteEmployee(int id) {
        con = DBConnection.createDBConnection();
        String query = "delete from employee where id=?";
        try{
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,id);
            int cnt = pstm.executeUpdate();
            if(cnt!=0)
                System.out.println("Employee Deleted Successfully !" + id);

        }catch (Exception ex){
            ex.printStackTrace();
        }

    }



}



