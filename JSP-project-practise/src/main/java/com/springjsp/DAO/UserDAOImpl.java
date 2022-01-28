package com.springjsp.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.springjsp.Entity.User;
@Repository
public class UserDAOImpl  extends BaseRepository implements UserDAO {

	@Transactional
	public void insertUser(User uobj) {
		super.persist(uobj); 

	}

	@Override
	public User selectUser(int uno) {
		User user = super.find(User.class, uno);
		return user;
	}

	@Override
	public List<User> selectUsers() {
		List<User>  userList = new ArrayList<>();
		return super.findAll("User");
	}

	@Transactional
	public void updateUser(User uobj) {
		super.merge(uobj);
	}


	@Transactional
	public void deleteUser(int uno) {
		super.remove(User.class, uno);

	}

}
