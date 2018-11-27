<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="myperson" class="useBean.model.Person" scope="request">
	
	</jsp:useBean>
	
	<jsp:getProperty property="name" name="myperson"/>
	<jsp:getProperty property="surname" name="myperson"/>
	<jsp:getProperty property="age" name="myperson"/>
	<%--id alanina “myperson”  ismi verdik , bu UseBeanProperty servlet sinifimizda request scope a ekledigimiz 
	Person objesinin attribute ismi. --%>
	
	<%--Ayni id ismini birden fazla kullanamayiz , bu durumda derleme hatasi verir ; Duplicate local variable --%>
	
	<%-- class alanina Person sinifimizi yazdik.Burada packagename.classname olacak sekilde yazmamiz gerekli.--%>
	
	<%-- <jsp:useBean> icin varsayilan scope “page” scope/yasam alanidir. Servlet sinifimizda request scope’una 
	attribute eklendigi icin burada da scope olarak request belirttik--%>
	
</body>
</html>