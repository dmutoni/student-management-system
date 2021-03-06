package dao;

import db.DbConnector;
import models.Admin;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AdminDao extends DbConnector {
    public int createAdmin(Admin admin) {
        try {
            String sql = "INSERT INTO admins(fullName,email,password,gender) VALUES (?,?,?,?);";
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, admin.getFullName());
            statement.setString(2, admin.getEmail());
            statement.setString(3, admin.getPassword());
            statement.setString(4, admin.getGender());
            int inserted = statement.executeUpdate();
            return inserted;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
            return 0;
        }
    }
    public ArrayList<Admin> getAdmins() {
        try {
            String sql = "SELECT * FROM admins;";
            Connection connection = getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            ArrayList<Admin> admins = new ArrayList<Admin>();
            while (resultset.next()) {
                Admin admin = new Admin();
                admin.setId(resultset.getInt(1));
                admin.setFullName(resultset.getString(2));
                admin.setGender(resultset.getString(4));
                admin.setPassword(resultset.getString(3));
                admins.add(admin);
            }
            resultset.close();
            statement.close();
            return admins;
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
            return new ArrayList<Admin>();
        }
    }
    public Admin getAdminsByEmail(String email) {
        try {
            String sql = "SELECT * FROM admins WHERE email=?;";
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, email);
            ResultSet resultset = statement.executeQuery(sql);
            Admin admin = null;
            while (resultset.next()) {
                admin = new Admin();
                admin.setId(resultset.getInt(1));
                admin.setFullName(resultset.getString(2));
                admin.setGender(resultset.getString(4));
                admin.setPassword(resultset.getString(3));
            }
            resultset.close();
            return null;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
    }
    public Admin getAdminsById(int id) {
        try {
            String sql = "SELECT * FROM admins WHERE id=?;";
            Connection connection = getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultset = statement.executeQuery(sql);
            Admin admin = null;
            while (resultset.next()) {
                admin = new Admin();
                admin.setId(resultset.getInt(1));
                admin.setFullName(resultset.getString(2));
                admin.setGender(resultset.getString(4));
                admin.setPassword(resultset.getString(3));
            }
            resultset.close();
            return null;
        } catch (SQLException | ClassNotFoundException e) {
            return null;
        }
    }
}
