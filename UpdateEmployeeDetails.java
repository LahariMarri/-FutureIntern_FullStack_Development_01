package test;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/updateEmployee")
public class UpdateEmployeeDetails extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        EmpBean eb = new EmpBean();
        eb.setId(req.getParameter("id"));
        eb.setName(req.getParameter("name"));
        eb.setSal(Float.parseFloat(req.getParameter("sal")));
        eb.setAddress(req.getParameter("address"));

        int result = new UpdateEmployeeDetailsDAO().update(eb);
        if (result > 0) {
            req.setAttribute("message", "Employee details updated successfully!");
        } else {
            req.setAttribute("message", "Error updating employee details.");
        }

        RequestDispatcher rd = req.getRequestDispatcher("UpdateEmpResponse.jsp");
        rd.forward(req, res);
    }
}
