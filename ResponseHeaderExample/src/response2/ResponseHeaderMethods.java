package response2;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseHeaderMethods extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// setHeader metodu ile response header ekliyoruz.
		// setHeader metodu, eger ilgili isme sahip(firstName) header yoksa
		// olusturur varsa uzerine yazar override eder.
		resp.setHeader("firstName", "myname");
		
		
		// setHeader metodu onceki firstName ismine sahip header bilgisini override edecektir.
		resp.setHeader("firstName", "myname-Override!");
		
		
		// containsHeader metodu parametre olarak aldigi degerde response header olup olmadigini kontrol eder.
		// Eger ilgili response header varsa true yoksa false donecektir.
		boolean contains = resp.containsHeader("firstName");
		System.out.println("contains: "+ contains);
		
		
		// getHeader metodu ile fistName ismine sahip response header'a ulasabiliriz.
		String firstName = resp.getHeader("firstName");
		System.out.println("firstName: "+ firstName);
		
		// addHeader metodu override yapmaz! Bunun yerine ekleme yapacaktir.
		resp.addHeader("firstName", "your name");
		resp.addHeader("firstName", "his name");
		
		// firstName ismine sahip response header'inin 3 tane degeri var.
		// Bu degerelere ulasmak icin asagidaki koda bakalim --->
		
		System.out.println(" ->>>>>  more value getHeader test");
		firstName = resp.getHeader("firstName");
		System.out.println("firstName: "+ firstName);
		
		// getHeader metodu yetersiz kalmaktadir.Eger ayni isme sahip header
		// varsa bu durumda ilk eklenen header'a ait degeri dondurmektedir.
		
		// birden fazla header ismini almaya calisacagiz
		System.out.println("getHeaders method test");
		
		Collection<String> headerNames = resp.getHeaderNames();
		for(String headerName : headerNames)
			System.out.println(headerName);
	}

}
