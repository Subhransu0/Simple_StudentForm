package in.sonu.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import in.sonu.model.User;
@Repository
public class UserDao {
    @Autowired
	private JdbcTemplate jdbcTemplate;

	public int insertData(User user) {
		String query = "insert into registermvc (name , email , password) values (? , ? , ?)";
		int i = jdbcTemplate.update(query, user.getFullname(), user.getEmail(), user.getPassword());
		return i;
	}

}
