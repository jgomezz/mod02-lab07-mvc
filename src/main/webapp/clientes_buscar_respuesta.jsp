<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="pe.edu.tecsup.app.modelo.Cliente"  %>   
<%@ page import="pe.edu.tecsup.app.util.Fecha" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	Fecha de la B&uacute;squeda : <%=Fecha.obtenerFechaActual()%>
	<BR>

	<%
	
	   // Variables predefinidas en el JSP ->  out , request, response, page
	   
	   Cliente value = (Cliente)request.getAttribute("cliente_llave");
	
	   if (value != null )
 	       out.println(value.getInformacion());
	   else
		   out.println("Registro no encontrado");
	   
	   
	%>


</body>
</html>