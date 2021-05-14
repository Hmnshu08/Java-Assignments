package steam.api.example;

public class News {

	
	private int newsId;
	private String postedByUser;
	private String commentByUser;
	private String comment;
	private int numbersOfComment;
	
	public News() {
		super();
	}
	
	
	public News(int newsId, String postedByUser, String commentByUser,String comment, int numbersOfComment) {
		super();
		this.newsId = newsId;
		this.postedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
		this.numbersOfComment = numbersOfComment;
		
	}
	
	
	public int getnewsId() {
		return newsId;
	}
	
	public void setnewsId(int newsId) {
		this.newsId = newsId;
	}	
	
	
	public String getpostedByUser() {
		return postedByUser;
	}
	
	public void setpostedByUser(String postedByUse) {
		this.postedByUser = postedByUser;
	}	
	
	
	
	public String getcommentByUser() {
		return commentByUser;
	}
	
	public void setcommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	
	
	public String getcomment() {
		return comment;
	}
	
	public void setcomment(String comment) {
		this.comment = comment;
	}
	
	
	public int getnumbersOfComment() {
		return numbersOfComment;
	}
	
	public void setnumbersOfComment(int numbersOfComment) {
		this.numbersOfComment = numbersOfComment;
	}
	
	
	@Override
	public String toString() {
		return "News  [News Id :"+ newsId + ", Posted By User :" +postedByUser+ ", Comment By User : "+commentByUser+" Comment :"+ comment+", Total Comments : "+numbersOfComment+" ]";
	}
	

	

}
