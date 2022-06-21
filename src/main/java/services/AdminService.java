package services;

import dao.AdminDao;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import models.Admin;

import java.io.IOException;

public class AdminService extends AdminDao {
    public void userLogin(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();
        Admin admin = new Admin(request.getParameter("email"), request.getParameter("password"));
        String rememberUser = request.getParameter("remember");
        Admin existingAdmin = getAdminsByEmail(request.getParameter("email"));
        if (existingAdmin == null) {
            session.setAttribute("error", "Invalid email");
            response.sendRedirect("login.jsp");
            return;
        }
        if (existingAdmin.getPassword().equals(request.getParameter("password"))) {
            session.setAttribute("error", "Invalid credentials");
            response.sendRedirect("login.jsp");
            return;
        }
        session.setAttribute("loggedIn", true);
        session.setAttribute("loggedInActionAdmin", admin.getId());
    }

    public void userRegister(HttpServletRequest request, HttpServletResponse response) throws IOException {
        HttpSession session = request.getSession();

        String pwd = request.getParameter("password");
        String cpwd = request.getParameter("cpassword");

        if (!pwd.equals(cpwd)) {
            session.setAttribute("error", "Passwords don't match");
            response.sendRedirect("register.jsp");
            return;
        }

        Admin existingAdmin = getAdminsByEmail(request.getParameter("email"));
        if (existingAdmin != null) {
            session.setAttribute("error", "Email already taken");
            response.sendRedirect("register.jsp");
            return;
        }

        Admin admin = new Admin();
        admin.setFullName(request.getParameter("fullName"));
        admin.setGender(request.getParameter("gender"));
        admin.setEmail(request.getParameter("email"));
        admin.setPassword(pwd);
        int created = createAdmin(admin);
        if (created == 1) {
            session.setAttribute("message", "Account created successfully");
            response.sendRedirect("login.jsp");
            return;
        } else {
            session.setAttribute("error", "Failed to create account!");
            response.sendRedirect("register.jsp");
            return;
        }
    }
}
