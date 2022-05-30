package com.tweetapp.request;

import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Getter
@Setter
@ToString
public class TweetRequest {
	@Id
	private int tweetId;
	@NotBlank(message = "userName cannot be Null")
	private String userName;
	@NotBlank(message = "Tweet cannot be Null")
	private String tweet;
	private Date created;
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
	public TweetRequest(int tweetId, @NotBlank(message = "userName cannot be Null") String userName,
			@NotBlank(message = "Tweet cannot be Null") String tweet, Date created) {
		super();
		this.tweetId = tweetId;
		this.userName = userName;
		this.tweet = tweet;
		this.created = created;
	}
	public TweetRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
