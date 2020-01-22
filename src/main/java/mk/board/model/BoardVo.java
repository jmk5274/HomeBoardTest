package mk.board.model;

public class BoardVo {

	private int board_id;                               // 게시판 번호
	private String user_id;                               // 아이디
	private String board_title;                               // 게시판 이름
	private String board_use;                               // 사용여부
	
	public BoardVo() {
		
	}
	
	public BoardVo(int board_id, String user_id, String board_title, String board_use) {
		this.board_id = board_id;
		this.user_id = user_id;
		this.board_title = board_title;
		this.board_use = board_use;
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
	public String getBoard_title() {
		return board_title;
	}
	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}
	public String getBoard_use() {
		return board_use;
	}
	public void setBoard_use(String board_use) {
		this.board_use = board_use;
	}
	
}
