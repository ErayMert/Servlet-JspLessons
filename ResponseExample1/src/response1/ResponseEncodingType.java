package response1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseEncodingType extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//turkce karakter cozumu icin bunu yapiyoruz
		resp.setCharacterEncoding("ISO-8859-9");
		
		PrintWriter pw = resp.getWriter();
		
		pw.print("<html>");
		//firefox taki turkce karakteri sorunu icin html tagi icinde yazmamiz gerekiyor
		pw.print("<head><meta charset='ISO-8859-9'></head>");
		pw.print("<body>");
		pw.print("<p>ışçğüö</p>");
		pw.print("</body></html>");
		
		String responseEncoding = resp.getCharacterEncoding();
		
		System.out.println("responseEncoding: " + responseEncoding);
	}

}
