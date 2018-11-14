package httpSession;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class HelloHttpSession extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter pWriter = resp.getWriter();
		
		//getSession() metodu session bilgisini donecektir.
		HttpSession session = req.getSession();
		
		//isNew() metodu , eger istemci ile bir session id eslesmemisse true donecektir.
		if(session.isNew())
			pWriter.print("new session");
		else {
			pWriter.print("old session");
		}
	}
}
