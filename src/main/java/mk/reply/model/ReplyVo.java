package mk.reply.model;

public class ReplyVo {

	private int reply_id;                               // 댓글 번호
	private String user_id;                               // 아이디
	private int post_id;                               // 게시글 번호
	private String reply_cont;                               // 댓글 내용
	private String reply_use;                               // 사용여부
	
	public ReplyVo() {
	}

	public ReplyVo(int reply_id, String user_id, int post_id, String reply_cont, String reply_use) {
		this.reply_id = reply_id;
		this.user_id = user_id;
		this.post_id = post_id;
		this.reply_cont = reply_cont;
		this.reply_use = reply_use;
	}
	
	public int getReply_id() {
		return reply_id;
	}
	public void setReply_id(int reply_id) {
		this.reply_id = reply_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getReply_cont() {
		return reply_cont;
	}
	public void setReply_cont(String reply_cont) {
		this.reply_cont = reply_cont;
	}
	public String getReply_use() {
		return reply_use;
	}
	public void setReply_use(String reply_use) {
		this.reply_use = reply_use;
	}

	@Override
	public String toString() {
		return "replyVo [reply_id=" + reply_id + ", user_id=" + user_id + ", post_id=" + post_id + ", reply_cont="
				+ reply_cont + ", reply_use=" + reply_use + "]";
	}
	
}
