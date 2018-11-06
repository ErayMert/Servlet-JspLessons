package servletLifecycle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletLifecycle extends HttpServlet{
	
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		System.out.println("Hello init() method");
		System.out.println("init() metodu ServletLifecycle boyunca bir kezz calisir");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		Date today = new Date();
		String msg = "ServletLifecycle";
		
		pw.print("<html><body> <h1>" + msg + "</h1>");
		pw.print("<p>today:" + today + "<p>");
		pw.println("<a href=    http://www.injavawetrust.com/>injavawetrust </a>");
		pw.print("</body></html>");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("####destroy");
	}

}
