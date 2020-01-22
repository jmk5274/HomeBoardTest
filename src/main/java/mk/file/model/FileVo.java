package mk.file.model;

public class FileVo {

	private int file_id;                               // 파일 번호
	private int post_id;                               // 게시글 번호
	private String file_name;                               // 파일 이름
	private String realfilepath;                               // 현재 경로
	
	public FileVo() { }
	
	public FileVo(int file_id, int post_id, String file_name, String realfilepath) {
		this.file_id = file_id;
		this.post_id = post_id;
		this.file_name = file_name;
		this.realfilepath = realfilepath;
	}
	
	public int getFile_id() {
		return file_id;
	}
	public void setFile_id(int file_id) {
		this.file_id = file_id;
	}
	public int getPost_id() {
		return post_id;
	}
	public void setPost_id(int post_id) {
		this.post_id = post_id;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public String getRealfilepath() {
		return realfilepath;
	}
	public void setRealfilepath(String realfilepath) {
		this.realfilepath = realfilepath;
	}

	@Override
	public String toString() {
		return "fileVo [file_id=" + file_id + ", post_id=" + post_id + ", file_name=" + file_name + ", realfilepath="
				+ realfilepath + "]";
	}
	
}
