package com.gcc.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;

import com.gcc.dao.ComplaintDao;

@WebServlet("/updateStatus")
public class UpdateComplaintStatusServlet extends jakarta.servlet.http.HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null || !"admin".equals(session.getAttribute("role"))) {
            response.sendRedirect("index.html");
            return;
        }

        int id = Integer.parseInt(request.getParameter("id"));
        String status = request.getParameter("status");

        ComplaintDao dao = new ComplaintDao();
        dao.updateStatus(id, status);

        response.sendRedirect("viewComplaints");
    }
}
