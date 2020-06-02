package d.bozhevilnyi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorDemo extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Integer code = (Integer) req.getAttribute("javax.servlet.error.status_code");
		resp.setContentType("text/html");
		
		PrintWriter writer = resp.getWriter();
		
		String title = "Error Handling";
		String docType = "<!DOCTYPE html>";
		
		writer.println(docType + "<html>" +
                "<head>" +
                "<title>" + title + "</title>" +
                "</head>" +
                "<body>");
		
		writer.println("<h1>Error information</h1>");
        writer.println("Code: " + code);
        writer.println("</body>");
        writer.println("</html>");
	}
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
