package com.gcc.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

import com.gcc.dao.UserDao;
import com.gcc.model.User;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String flatNo = request.getParameter("flat_no");
        String password = request.getParameter("password");

        User user = new User(name, email, flatNo, password, "resident");
        UserDao userDao = new UserDao();
        userDao.saveUser(user);

        RequestDispatcher rd = request.getRequestDispatcher("index.html");
        rd.forward(request, response);
    }
}
