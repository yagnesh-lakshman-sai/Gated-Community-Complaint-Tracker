package com.gcc.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import com.gcc.dao.ComplaintDao;
import com.gcc.model.Complaint;

@WebServlet("/addComplaint")
public class AddComplaintServlet extends jakarta.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("index.html");
            return;
        }

        int userId = (int) session.getAttribute("userId");
        String category = request.getParameter("category");
        String description = request.getParameter("description");
        Date date = Date.valueOf(LocalDate.now());
        String status = "Pending";

        Complaint c = new Complaint(userId, category, description, date, status);
        ComplaintDao dao = new ComplaintDao();
        dao.saveComplaint(c);

        RequestDispatcher rd = request.getRequestDispatcher("viewComplaints.jsp");
        rd.forward(request, response);
    }
}
