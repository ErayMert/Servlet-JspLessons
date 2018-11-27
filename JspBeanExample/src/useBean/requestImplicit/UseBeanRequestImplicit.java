package useBean.requestImplicit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import useBean.model.Person;

public class UseBeanRequestImplicit extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person person = new Person("Eray", "Mert", 24);
		req.setAttribute("myperson", person);
		
		RequestDispatcher view = req.getRequestDispatcher("useBean/requestImplicit.jsp");
		view.forward(req, resp);
	}

}
