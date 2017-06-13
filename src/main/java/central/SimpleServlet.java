package central;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;

public class SimpleServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest reqest, HttpServletResponse response) 
			throws ServletException, IOException {
	    response.setContentType("text/html;charset=UTF-8");
	    PrintWriter out = response.getWriter();
	    Date date = new Date();
	    try {

	        out.println("<html>");
	        out.println("<head>");
	        out.println("<title>the date</title>");
	        out.println("</head>");
	        out.println("<body>");
	        out.println("<h1>" + date.toString() + "</h1>");
	        out.println("</body>");
	        out.println("</html>");

	    } finally {
	        out.close();
	    }
	}
	@Override
	public void init() throws ServletException {
		System.out.println("Servlet " + this.getServletName() + " has started");
	}
	@Override
	public void destroy() {
		System.out.println("Servlet " + this.getServletName() + " has stopped");
	}
}