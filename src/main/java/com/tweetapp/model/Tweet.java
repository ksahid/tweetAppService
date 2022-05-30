package com.tweetapp.model;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table(name="TWEET")
@Component
public class Tweet {
	
	@Id
	private int tweetId;
	private String userName;
	private String tweet;
	private Date created;
	//private Map<String, Integer> likes;
	//private Map<String, List<String>> replies;
	public int getTweetId() {
		return tweetId;
	}
	public void setTweetId(int tweetId) {
		this.tweetId = tweetId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	/*
	 * public Map<String, Integer> getLikes() { return likes; } public void
	 * setLikes(Map<String, Integer> likes) { this.likes = likes; } public
	 * Map<String, List<String>> getReplies() { return replies; } public void
	 * setReplies(Map<String, List<String>> replies) { this.replies = replies; }
	 */
	
	public Tweet(int tweetId, String userName, String tweet, Date created, Map<String, Integer> likes,
			Map<String, List<String>> replies) {
		super();
		this.tweetId = tweetId;
		this.userName = userName;
		this.tweet = tweet;
		this.created = created;
		//this.likes = likes;
		//this.replies = replies;
	}
	public Tweet() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
