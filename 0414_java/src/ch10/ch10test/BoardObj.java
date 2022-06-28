package ch10.ch10test;

public class BoardObj {

	private String title;
	private String writer;
	private String cnts;
	
	
	public BoardObj() {}
	public BoardObj(String s1, String s2, String s3) {
		this.title = s1;
		this.writer = s2;
		this.cnts = s3;
	}//BoardObj
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "제목 :" + title 
				+ ", 작성자 : " + writer
				+ ", 내용 " + cnts;
	}//toString 
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getCnts() {
		return cnts;
	}
	public void setCnts(String cnts) {
		this.cnts = cnts;
	}
	
	
}//class
