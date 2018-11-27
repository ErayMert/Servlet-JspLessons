package useBean.requestImplicit;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import useBean.model.Person;

public class UseBeanProperty extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Person person = new Person("Eray","Mert",24);
		req.setAttribute("myperson", person);
		
		RequestDispatcher view = req.getRequestDispatcher("useBean/useBean.jsp");
		view.forward(req, resp);
		
		//UserBeanProperty sinifinda Person objesi olusturduk
		
		//Olusturdugumuz bu Person objesini request scope a attribute olarak verdik.
		
		//Daha sonrasinda useBean.jsp sayfasina gelen istegi dispatch ettik.
		
		//<jsp:useBean> action ile request scope eklenen bu objeyi aldik sonrasinda <jsp:getProperty> 
		//action'i ile objenin property alanlarina ulastik
	}
}
