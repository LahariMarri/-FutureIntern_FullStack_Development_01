package test;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/deleteEmployee")
public class DeleteEmployeeDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String empId = req.getParameter("id");

        int result = new DeleteEmployeeDetailsDAO().delete(empId);
        req.setAttribute("message", result > 0 ? "Employee deleted successfully." : "Failed to delete employee.");
        
        RequestDispatcher rd = req.getRequestDispatcher("DeleteEmployee.jsp");
        rd.forward(req, res);
    }
}
