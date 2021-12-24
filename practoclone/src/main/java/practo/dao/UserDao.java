package practo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import practo.model.Login;
import practo.model.User;

@Repository
public class UserDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Autowired
	DataSource dataSource;
	@Transactional
	public int saveUser(User user) {
		int id=(Integer)this.hibernateTemplate.save(user);
		return id;
	}
	
	public User validateUser(Login login) throws DataAccessException {
		String sql="select * from user where email='"+login.getEmail()+"' and password='"+login.getPassword()+"'";
		List<User> users=jdbcTemplate.query(sql, new UserMapper());
		return users.size()>0?users.get(0):null;
	}
}

class UserMapper implements RowMapper<User>{
	public User mapRow(ResultSet rs, int arg1) throws SQLException{
		User user=new User();
		user.setEmail(rs.getString("email"));
		user.setPassword(rs.getString("password"));
		user.setUsername(rs.getString("username"));
		return user;
	}
}
