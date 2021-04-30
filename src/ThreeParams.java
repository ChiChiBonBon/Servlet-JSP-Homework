

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.eclipse.jdt.internal.compiler.ast.ThisReference;

/**
 * Servlet implementation class ThreeParams
 */
@WebServlet("/ThreeParams")
public class ThreeParams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThreeParams() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
		String title = "Reading Three Request Parameters";
		out.println("<html><body bgcolor=\"#FDF5E6\">\n" +
		            "<H1 Align = center>" + title + "</h1>\n" +
				    "<ul>\n" +
		            "<li><b>param1</b>:</li>" +
				    request.getParameter("param1") + "\n" +
		            "<li><b>param2</b>:</li>" +
				    request.getParameter("param2") + "\n" +
		            "<li><b>param3</b>:</li>" +
				    request.getParameter("param3") + "\n" +
		            "</ul>\n" + 
				    "</body></html>");
		            
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
