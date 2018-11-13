package request.listener;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletRequestAttributeListenMe extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setAttribute("name", "myname attribute");
		req.setAttribute("name", "new myname attribute");
		req.removeAttribute("name");
	}
	
	//servlet class i calistiginda console ekranindaki calisma sekli asagidaki gibi olacaktir.
	//request attributeReplaced :org.apache.catalina.ASYNC_SUPPORTED true
	//request attributeAdded :name myname attribute
	//request attributeReplaced :name myname attribute
	//request attributeRemoved :name new myname attribute

}
