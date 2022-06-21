package services;

import dao.AdminDao;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Admin;

import java.io.IOException;

public class AdminService extends AdminDao {
    public void userLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        Admin admin = new Admin(request.getParameter("email"), request.getParameter("password"));
        String rememberUser = request.getParameter("remember");

        response.sendRedirect("index.jsp");
    }
    public void userRegister(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();

        String pwd = request.getParameter("password");
        String cpwd = request.getParameter("cpassword");

        if(pwd!=cpwd) {
            session.setAttribute("error", "Passwords don't match");
            response.sendRedirect("register.jsp");
            return;
        }

        Admin admin = new Admin();
        admin.setFullName(request.getParameter("fullName"));
        admin.setGender(request.getParameter("gender"));
        admin.setEmail(request.getParameter("email"));
        admin.setPassword(pwd);
        response.sendRedirect("index.jsp");
    }
}
