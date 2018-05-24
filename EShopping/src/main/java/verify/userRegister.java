package verify;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;

import domain.DataSourceUtils;

/**
 * Servlet implementation class userRegisterServlet
 */
public class userRegister extends HttpServlet {


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");//仅适用于post提交方式乱码
		String verifycode_I = (String) request.getParameter("verifycode");
		
		String verifycode_O = (String) request.getSession().getAttribute("checkcode_session");
		String id = request.getSession().getId();
		response.getWriter().write(id);
		if(verifycode_I==verifycode_O) {
			User user = new User();
			//request.setCharacterEncoding("UTF-8");//仅适用于post提交方式乱码
			Map<String, String[]> properties = request.getParameterMap();
			
			try {
				BeanUtils.populate(user, properties);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();

			}
			user.setName(new String(user.getName().getBytes("iso-8859-1"),"UTF-8"));//get和post方式都适用
			user.setUid(UUID.randomUUID().toString());
			try {
				regist(user);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else {
			response.getWriter().write("Error Validation Code");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public void regist(User user) throws SQLException {
		QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
		String sql = "insert into user values(?,?,?,?,?,?,?,?,?,?,?,?)";
		runner.update(sql, user.getUid(),user.getUsername(),user.getPassword(),user.getName(),user.getEmail(),user.getTelephone(),
				user.getBirthday(),user.getSex(),user.getProvince(),user.getCity(),null,null);
	}

}
