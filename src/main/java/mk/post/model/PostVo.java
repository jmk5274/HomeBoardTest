package mk.post.model;

public class PostVo {

	private int post_id;                               // 게시글 번호
	private int board_id;                               // 게시판 번호
	private String user_id;                               // 작성자
	private int pa_post_id;                               // 부모글 번호
	private String post_title;                               // 게시글 제목
	private String post_date;                               // 게시글 날짜
	private String post_cont;                               // 게시글 내용
	private int gn;                               // 그룹넘버
	private String post_use;                               // 사용여부
	
	public PostVo() {
	}
	
	public PostVo(int post_id, int board_id, String user_id, int pa_post_id, String post_title, String post_date,
			String post_cont, int gn, String post_use) {
		this.post_id = post_id;
		this.board_id = board_id;
		this.user_id = user_id;
		this.pa_post_id = pa_post_id;
		this.post_title = post_title;
		this.post_date = post_date;
		this.post_cont = post_cont;
		this.gn = gn;
		this.post_use = post_use;
	}
	
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public int getBoard_id() {
		return board_id;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public int getPa_post_id() {
		return pa_post_id;
	}
	public void setPa_post_id(int pa_post_id) {
		this.pa_post_id = pa_post_id;
	}
	public String getPost_title() {
		return post_title;
	}
	public void setPost_title(String post_title) {
		this.post_title = post_title;
	}
	public String getPost_date() {
		return post_date;
	}
	public void setPost_date(String post_date) {
		this.post_date = post_date;
	}
	public String getPost_cont() {
		return post_cont;
	}
	public void setPost_cont(String post_cont) {
		this.post_cont = post_cont;
	}
	public int getGn() {
		return gn;
	}
	public void setGn(int gn) {
		this.gn = gn;
	}
	public String getPost_use() {
		return post_use;
	}
	public void setPost_use(String post_use) {
		this.post_use = post_use;
	}

	@Override
	public String toString() {
		return "postVo [post_id=" + post_id + ", board_id=" + board_id + ", user_id=" + user_id + ", pa_post_id="
				+ pa_post_id + ", post_title=" + post_title + ", post_date=" + post_date + ", post_cont=" + post_cont
				+ ", gn=" + gn + ", post_use=" + post_use + "]";
	}
	
}
