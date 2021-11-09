package sec01.ex02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondServlet
 */
@WebServlet("/second")
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		String user_address = request.getParameter("user_address");
		
		out.println("<html><body>");
		if(user_id!=null&&user_id.length()!=0) {
			out.println("�̹� �α��� �����Դϴ�.<br><br>");
			out.println("�Ѱܹ��� ���̵� : "+user_id+"<br>");
			out.println("�Ѱܹ��� ��й�ȣ : "+user_pw+"<br>");
			out.println("�Ѱܹ��� �ּ� : "+user_address+"<br>");
			out.println("</body></html>");	
		}else {
			out.println("�α��ε��� �ʾҽ��ϴ�.<br><br>");
			out.println("�ٽ� �α����ϼ���!<br>");
			out.println("<a href='/pro09/login.html'>�α���â���� �̵��ϱ�</>");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}