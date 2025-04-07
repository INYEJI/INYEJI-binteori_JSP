package unit01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/AddtionServlet01")
public class AddtionServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public AddtionServlet01() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int num1 = 20;
		int num2 = 10;
		int add = num1+num2;
		PrintWriter out = response.getWriter();
		out.println("<html><head><title>Addutuib</title></head>");
		out.println("<body>");
		out.println(num1 + "+ "+ num2 + " =" + add);
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost........");
	}

}
