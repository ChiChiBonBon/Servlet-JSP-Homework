

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Membership
 */
@WebServlet("/Membership")
public class Membership extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Membership() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String name = null;
//		String school = null;
//		String gender = null;
//		String[] transportation = null;
//		String subject = null;
//		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
//		
//	    name = request.getParameter("name");
//		school = request.getParameter("school");
//		subject = request.getParameter("subject");
//		gender = request.getParameter("gender");
//		transportation = request.getParameterValues("transportation");
//		PrintWriter out = response.getWriter();
//		
//		out.println("<html>");
//		out.println("<head>\r\n" + 
//				"    <meta charset=\"UTF-8\">\r\n" + 
//				"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n" + 
//				"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n" + 
//				"    <title>會員註冊</title>\r\n" + 
//				"    <style></style>\r\n" + 
//				"</head>");
//		out.println("<body>");
//		out.println("<H1>註冊成功</H1>");
//		out.println("<label>姓名:</label>\r\n" + 
//				"        <br>\r\n" + 
//							  name + 
//				"        <br>\r\n" + 
//				"        <label>畢業學校:</label>\r\n" + 
//				"        <br>\r\n" + 
//							school +
//				"        <br>\r\n" + 
//				"        <label>畢業科系:</label>\r\n" + 
//				"        <br>\r\n" + 
//						   subject +
//				"        <br>\r\n" +                         
//				"        <label>性別:</label>\r\n" + 
//				"        <br>\r\n" +
//						   gender  +
//				"        <br>\r\n" +
//				"        <label>交通工具:</label>\r\n" + 
//				"        <br>");
//		for(String x:transportation) {
//			out.println(x);
//		}
//		out.println("</body>");
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("./Display.jsp");
		requestDispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
