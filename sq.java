

import java.io.IOException;
import java.io.PrintWriter;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class sq extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException
	{
		int k=(int)request.getAttribute("k");
		k=k*k;
		PrintWriter out=response.getWriter();
		out.println(k);
	}
}


		
		
	
