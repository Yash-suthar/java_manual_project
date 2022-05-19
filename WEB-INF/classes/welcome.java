import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class welcome extends HttpServlet{
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException,ServletException{
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      out.println("<h1> hello world </h1>");
  }
}