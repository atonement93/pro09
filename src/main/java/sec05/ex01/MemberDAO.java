package sec05.ex01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	public boolean isExisted(MemberVO memberVO) {
		boolean result = false;
		
		try {
			Context ctx = new InitialContext();
			Context envContext = (Context) ctx.lookup("java:/comp/env");
			DataSource dataFactory = (DataSource) envContext.lookup("jdbc/oracle");

			
			String id = memberVO.getId();
			String pw = memberVO.getPw();
			
			Connection con = dataFactory.getConnection();
			
			String query = "select decode(count(*),1,'true','false') as result from t_member";
			query+= " where id=? and pw=?";
			
			
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, id);
			pstmt.setString(2, pw);
			ResultSet rs = pstmt.executeQuery();
			rs.next();
			result = Boolean.parseBoolean(rs.getString("result"));
			System.out.println("result=" + result);
			
				rs.close();
				pstmt.close();
				con.close();
	
			}catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return result;
	}
}


