package responsecookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseCookieMethod extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Cookie usernameCookie = new Cookie("userName", "eray");
		Cookie passwordCookie = new Cookie("password", "12345");
		
		resp.addHeader("Set-Cookie", "testName =testValue");
		
		resp.addCookie(usernameCookie);
		resp.addCookie(passwordCookie);
		
		Cookie [] cookies = req.getCookies();
		if(cookies !=null)
			for(Cookie c : cookies)
				System.out.println(c.getName() + " " + c.getValue());
	}
}
