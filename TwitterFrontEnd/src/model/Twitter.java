package model;

import java.sql.Timestamp;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name ="twitter")
@SessionScoped
public class Twitter {
	

	private Timestamp timestamp;
	private String tweetBody;
	private Long tweetID;
	
	
	public Timestamp getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}


	public String getTweetBody() {
		return tweetBody;
	}


	public void setTweetBody(String tweetBody) {
		this.tweetBody = tweetBody;
	}


	public Long getTweetID() {
		return tweetID;
	}


	public void setTweetID(Long tweetID) {
		this.tweetID = tweetID;
	}


	public TwitterEntity getEntity() 
	{
		TwitterEntity twitterentity = new TwitterEntity();
		twitterentity.setTimestamp(timestamp);
		twitterentity.setTweetBody(tweetBody);
		twitterentity.setTweetID(tweetID);
		
		return twitterentity;
		
	}

}
