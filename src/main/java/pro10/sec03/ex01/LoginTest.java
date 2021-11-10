package pro10.sec03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginTest
 */
@WebServlet("/login")
public class LoginTest extends HttpServlet implements Filter {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig filterConfig) throws javax.servlet.ServletException { 
         // TODO Auto-generated method stub
    }

	/**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2) throws java.io.IOException, javax.servlet.ServletException { 
         // TODO Auto-generated method stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		out.println("<html><body>");
		out.println("아이디 : "+user_id+"<br>");
		out.println("비밀번호 : "+user_pw);
		out.println("</body></html>");
	}

}
