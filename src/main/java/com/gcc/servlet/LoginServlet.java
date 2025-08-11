package com.gcc.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

import com.gcc.dao.UserDao;
import com.gcc.model.User;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");

        UserDao userDao = new UserDao();
        User user = userDao.getUserByEmail(email);

        if (user != null && user.getPassword().equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("userId", user.getId());
            session.setAttribute("name", user.getName());
            session.setAttribute("email", user.getEmail());
            session.setAttribute("role", user.getRole());

            if ("admin".equals(user.getRole())) {
                RequestDispatcher rd = request.getRequestDispatcher("adminDashboard.jsp");
                rd.forward(request, response);
            } else {
                RequestDispatcher rd = request.getRequestDispatcher("residentDashboard.jsp");
                rd.forward(request, response);
            }
        } else {
            request.setAttribute("error", "Invalid email or password");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.forward(request, response);
        }
    }
}
