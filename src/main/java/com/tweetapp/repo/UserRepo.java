package com.tweetapp.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Long> { 
	
	//@Query("select u from USER u where u.userName = (?1) and u.password = (?2)")
	Optional<User> findByemailIdAndPassword(String emailId, String password);

	//@Query("select u from USER u where u.userName = (?1) ")
	Optional<User> findByEmailId(String emailId);
	
	Optional<User> findByFirstName(String userName);
	

}


