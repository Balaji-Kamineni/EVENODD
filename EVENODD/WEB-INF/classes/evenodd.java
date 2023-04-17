import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class evenodd extends HttpServlet
{
	public void service(ServletRequest request, ServletResponse response) throws ServletException,IOException{
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		int num=Integer.parseInt(request.getParameter("num"));
		out.print("<body bgcolor=green> ");
		if (num%2==0)
		{
			out.print("<h1 align =center> Entered number is Even </h1>");
		}else if (num==0)
		{
			out.print("<h1 align=center> Entered number is Zero</h1>");
		}else{
			out.print("<h1 align =center> Entered number is Odd </h1>");
		}
		out.print("</body>");
		out.close();
	}
}