package request2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MoreRequestMethod extends HttpServlet{
@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	PrintWriter pw = resp.getWriter();

	
	//  metodu ile header bilgilerine ulasabiliriz.
	String hostHeader = req.getHeader("host");
	
	// getServerName() metodu server ismini dondurur; localhost.
	String serverName = req.getServerName();
	
	//local port ise bu istegin tamamlandigi porttur.
	int localPort = req.getLocalPort();
	
	// server port requestin ilk karsilandigi basladigi porttur.
	int serverPort = req.getServerPort();
	
	//Istegin gonderildigi porttur. Remote’tan kasit client/istemci yani tarayicidir.
	int remotePort = req.getRemotePort();
	
	// bize kullandigimiz HTTP metodunun tur bilgisini dondurur.
	String method = req.getMethod();
	
	//context path bilgisini dondurecektir
	String contexPath = req.getContextPath();

	pw.println("<html><body>");
	pw.println("<table>");
	pw.println("<tr><td>host<td>" + hostHeader);
	
	//getHeaderNames() metodu tum header bilgilerini geri dondururur.
	Enumeration<String> headerNames = req.getHeaderNames();
	while (headerNames.hasMoreElements()) {
		String headerName = headerNames.nextElement();
		pw.println("<tr><td>" + headerName);
		pw.println("<td>" + req.getHeader(headerName));
	}

	pw.println("<tr><td>serverName<td>" + serverName);
	pw.println("<tr><td>localPort<td>" + localPort);
	pw.println("<tr><td>serverPort<td>" + serverPort);
	pw.println("<tr><td>remotePort<td>" + remotePort);
	pw.println("<tr><td>method<td>" + method);
	pw.println("<tr><td>contexPath<td>" + contexPath);
	pw.println("</table>");
	pw.println("</html></body>");
	}
}
