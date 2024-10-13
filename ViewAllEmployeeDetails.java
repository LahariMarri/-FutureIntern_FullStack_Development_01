package test;

import java.io.IOException;
import java.util.List;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/viewAll")
public class ViewAllEmployeeDetails extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        List<EmpBean> employeeList = new ViewAllEmployeeDetailsDAO().getAllEmployees();
        req.setAttribute("employeeList", employeeList);
        
        RequestDispatcher rd = req.getRequestDispatcher("ViewAllEmpDetails.jsp");
        rd.forward(req, res);
    }
}
