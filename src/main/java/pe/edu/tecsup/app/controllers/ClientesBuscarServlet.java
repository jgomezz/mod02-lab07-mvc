package pe.edu.tecsup.app.controllers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.tecsup.app.modelo.Cliente;

/**
 * Servlet implementation class ClientesBuscarServlet
 */
@WebServlet("/ClientesBuscarServlet")
public class ClientesBuscarServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
	//          key , value
	private Map<String,Cliente> clientes = new HashMap<String, Cliente>();
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ClientesBuscarServlet() {
    	super();
    	clientes.put("X001",new Cliente("X001","Jaime","Gomez","Diaz"));
    	clientes.put("X002",new Cliente("X002","Maria","Mercedes","Leon"));
    	clientes.put("X003",new Cliente("X003","Pedro","Candia","Ruiz"));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		// Leer datos ingresados
		String codigo = request.getParameter("txtCodigo");
		
		System.out.println("Codigo --> " + codigo);
		
		// Procesamiento de datos
		System.out.println(clientes);
		
		Cliente value = clientes.get(codigo);

		System.out.println(value);
		
		if (value != null) {
			// Guardar el valor en el REQUEST
			request.setAttribute("cliente_llave", value);
		}

		// Preparar respuesta
		RequestDispatcher rd 
			= request.getRequestDispatcher("clientes_buscar_respuesta.jsp");
		
		rd.forward(request, response);
		
	}

}
