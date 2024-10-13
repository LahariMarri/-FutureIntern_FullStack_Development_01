package test;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

@SuppressWarnings("serial")
@WebServlet("/vij")
public class AddEmployeeDetails extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		EmpBean eb=new EmpBean();
		eb.setId(req.getParameter("id"));
		eb.setName(req.getParameter("name"));
		eb.setSal(Float.parseFloat(req.getParameter("sal")));
		eb.setAddress(req.getParameter("addr"));
		int k=new AddEmployeeDetailsDAO().insert(eb);
		if(k>0)
		{
			RequestDispatcher rd=req.getRequestDispatcher("AddEmployeeDetails.jsp");
			rd.forward(req, res);
		}
	}

}
