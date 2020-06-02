package d.bozhevilnyi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PassingParametersUsingGetMethodDemo extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		String title = "Passing parameters using GET method";
		
		String docType = "<!DOCTYPE html>";
		
		writer.println("<html>" + 
				"<head><title>" + title + "</title></head>\n" +
				"<body><h2>Specialty: </h2>" + req.getParameter("specialty") + 
				"<h2>Experience: </h2>" + req.getParameter("experience") + 
				"</body>" + 
				"</html>");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
