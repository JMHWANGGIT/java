package ch042;


class Ch042Dummy6 {
	
	
	String memStr;
	
	public Ch042Dummy6() {}
	
	//굉장히 많이 쓰이는 표현 
	public Ch042Dummy6(String memStr) {
		this.memStr = memStr;
		//생성자 안에서도 this를 사용하여 자기 자신의 instance에 접근 가능하다. 
	}
	//alt + s + r (단축키) 
	public String getMemStr() {
		return memStr;
	}

	public void setMemStr(String memStr) {
		this.memStr = memStr;
	}

}//class


public class Ch042Ex12 {
	public static void main(String[] args) {
	
		
		
	}//main
}//class

