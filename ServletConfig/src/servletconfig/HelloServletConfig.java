package servletconfig;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServletConfig extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pw = resp.getWriter();
		ServletConfig config = getServletConfig();
		
		String driverClassName = config.getInitParameter("driverClassName");
		String url = config.getInitParameter("url");
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		
		String servletName = config.getServletName();
		
		pw.print("<html><body>");
		pw.print(servletName + "<br>");
		pw.print(driverClassName + "<br>");
		pw.print(url + "<br>");
		pw.print(username + "<br>");
		pw.print(password + "<br>");
		pw.print("</body></html>");

		Enumeration<String> enm = config.getInitParameterNames();
		while (enm.hasMoreElements()) {
			System.out.println(enm.nextElement());
		}
	}
	
	
	
}
