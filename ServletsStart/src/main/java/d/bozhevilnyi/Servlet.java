package d.bozhevilnyi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet extends HttpServlet{
	
	
	private String message;
	
	public void init() throws ServletException{
		message = "Servlet message!";
	}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter messageWriter = resp.getWriter();
		messageWriter.println("<h1>" + message + "<h1>");
	
	}
	
	public void destroy() {
	}

}
