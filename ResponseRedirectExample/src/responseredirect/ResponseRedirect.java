package responseredirect;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseRedirect extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int status = HttpServletResponse.SC_MOVED_TEMPORARILY;
		if(status == HttpServletResponse.SC_OK) {
			
		}
		else {
			
			//sendRedirect metoduna arguman olarak verdigimiz adress ; relative path ya da absolute path olabilir.
			resp.sendRedirect("https://github.com/ErayMert/Servlet-JspLessons");
		}
	}
}
