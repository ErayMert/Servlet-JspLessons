package attribute.mvc.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import attribute.mvc.model.People;

public class RequestController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		People person1 = new People("Eray","Mert","Bay" );
		People person2 = new People("Enes","Pehlivan","Bay" );
		People person3 = new People("Pinar","Duru","Bayan" );
		
		List<People> peoples = new ArrayList<People>();
		peoples.add(person1);
		peoples.add(person2);
		peoples.add(person3);
		
		req.setAttribute("peopleList", peoples);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("requestdispatcher.jsp");
		
		dispatcher.forward(req, resp);
		
		//* forward metodunda url degismez , sendRedirect metodunda url degisir.
		//* Dispatch islemi  server’da olur , Redirect islemi ise client’ta olur.
		//* Redirect islemini soyle dusunebiliriz ; musteri bir problemle karsilasti 
		// ve sizi aradi siz bu isten ben sorumlu degilim diyerek musteriyi farkli bir kisiye yonlendiriyorsunuz. (url degisir)
		// *Dispatch islemi ise ; musterinin karsilastigi problemi cozerken calisma arkadasinizdan yardim aliyorsunuz
		// arka planda isin sizin yaptiginiz sanilirken aslinda calisma arkadasiniz bu isi yapmaktadir. 
		// Musterinin bundan haberi yoktur.( url degismez)
		
		/// ---------- ONEMLIIII ----------
		/* ServletContext context = getServletContext();

		RequestDispatcher dispatcher = context
		// .getRequestDispatcher("/requestdispatcher.jsp");
		// #### / ile baslamalidir!

		RequestDispatcher dispatcher = context
				.getRequestDispatcher("/requestattribute/requestdispatcher.jsp");*/
		
		
		/*Son olarak, eger forwad metodunu cagirmadan once getOutputStream metodunu cagirirsak
		IllegalStateException hatasi aliriz ;*/
	}
	
}
