package com.gcc.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.gcc.model.Complaint;
import com.gcc.utils.Constants;
import com.gcc.utils.DBConnection;

public class ComplaintDao {

    public void saveComplaint(Complaint c) {
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(Constants.INSERT_COMPLAINT);
            ps.setInt(1, c.getUserId());
            ps.setString(2, c.getCategory());
            ps.setString(3, c.getDescription());
            ps.setDate(4, c.getDate());
            ps.setString(5, c.getStatus());
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Complaint> getComplaintsByUser(int userId) {
        List<Complaint> list = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(Constants.GET_COMPLAINTS_BY_USER);
            ps.setInt(1, userId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Complaint c = new Complaint();
                c.setId(rs.getInt("id"));
                c.setUserId(rs.getInt("user_id"));
                c.setCategory(rs.getString("category"));
                c.setDescription(rs.getString("description"));
                c.setDate(rs.getDate("date"));
                c.setStatus(rs.getString("status"));
                list.add(c);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Complaint> getAllComplaints() {
        List<Complaint> list = new ArrayList<>();
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(Constants.GET_ALL_COMPLAINTS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Complaint c = new Complaint();
                c.setId(rs.getInt("id"));
                c.setUserId(rs.getInt("user_id"));
                c.setCategory(rs.getString("category"));
                c.setDescription(rs.getString("description"));
                c.setDate(rs.getDate("date"));
                c.setStatus(rs.getString("status"));
                c.setUserName(rs.getString("name"));
                c.setUserEmail(rs.getString("email"));
                c.setUserFlat(rs.getString("flat_no"));
                list.add(c);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void updateStatus(int id, String status) {
        try {
            Connection connection = DBConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(Constants.UPDATE_COMPLAINT_STATUS);
            ps.setString(1, status);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
