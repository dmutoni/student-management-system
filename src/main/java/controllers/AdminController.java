package controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import services.AdminService;

import java.io.IOException;

@WebServlet("/AdminController")
public class AdminController extends HttpServlet {

    private AdminService adminService = new AdminService();

    public AdminController() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().append("GOT THERE");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        switch (action) {
            case "login":
                adminService.userLogin(req, resp);
                break;
            case "register":
                adminService.userRegister(req, resp);
                break;
            default:
                resp.sendRedirect("index.jsp");
                break;
        }
    }
}
