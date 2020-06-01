package d.bozhevilnyi;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletResponseDemo extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	resp.setContentType("text/html");
	
	PrintWriter writer = resp.getWriter();
	String title = "HTTP Servlet Response Demo";
	String docType = "<!DOCTYPE html>";
	
	writer.println(docType + 
			"<html>\n" + "<head><title>" + title + "</title></head>\n" + 
			"<body>" + resp.getContentType() + "</body>");
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
