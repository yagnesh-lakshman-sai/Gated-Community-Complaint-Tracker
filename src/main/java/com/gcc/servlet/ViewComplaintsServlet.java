package com.gcc.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.util.List;

import com.gcc.dao.ComplaintDao;
import com.gcc.model.Complaint;

@WebServlet("/viewComplaints")
public class ViewComplaintsServlet extends jakarta.servlet.http.HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("index.html");
            return;
        }

        String role = (String) session.getAttribute("role");
        ComplaintDao dao = new ComplaintDao();
        if ("admin".equals(role)) {
            List<Complaint> list = dao.getAllComplaints();
            request.setAttribute("complaints", list);
            RequestDispatcher rd = request.getRequestDispatcher("adminDashboard.jsp");
            rd.forward(request, response);
        } else {
            int userId = (int) session.getAttribute("userId");
            List<Complaint> list = dao.getComplaintsByUser(userId);
            request.setAttribute("complaints", list);
            RequestDispatcher rd = request.getRequestDispatcher("viewComplaints.jsp");
            rd.forward(request, response);
        }
    }
}
