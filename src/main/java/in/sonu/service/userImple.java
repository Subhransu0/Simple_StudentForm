package in.sonu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.sonu.dao.UserDao;
import in.sonu.model.User;

@Service
public class userImple implements UserServiceInterface {
	@Autowired
	private UserDao userDao;

	@Override
	public int registerUser(User user) {
		int i = userDao.insertData(user);
		return i;
	}

}
