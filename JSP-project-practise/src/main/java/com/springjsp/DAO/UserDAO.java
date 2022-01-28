package com.springjsp.DAO;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.springjsp.Entity.User;


@Repository
public interface UserDAO {
	void insertUser(User uobj); // C

	User selectUser(int uno); // R

	List<User> selectUsers(); // RA

	void updateUser(User uobj); // U

	void deleteUser(int uno); // D
}
