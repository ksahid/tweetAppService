package com.tweetapp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tweetapp.model.Tweet;

@Repository
public interface TweetRepo extends  CrudRepository<Tweet, Integer> {  

	
	//@Query("select u from USER u where u.userName = (?1) ")
	List<Tweet> findByUserName(String userName);

}
