package ch051;

/*
 * Encapsulation : 은형성 (개념)
 * - 데이터의 의도하지않은 변경을 막으려는 개념 
 * - 잘못된 데이터 입력 방지하기 위해
 * - data hidden : data 은닉 
 * - 보호하려는 data를 private으로 선언
 * - private data에 접근하는 메소드(set메소드, get메소드)를 만들어 주는 개념 
 * - set메소드, get메소드 : public 선언이 기본 
 * - set메소드 : data를 입력하는 개념 
 * - get메소드 : data를 출력하는 개념 
 */

class RegistProduct {//상품등록
	private String productName;
	private int price;
	
	public String getProductName() {
		return productName;//출력 
	}
	public void setProductName(String productName) {
		if(productName.length() <=0) return; //종료 
		if(productName.trim().equals("")) return; //종료 (제품명을 공백을 잘라봤더니 내용이 없다!!)
		this.productName = productName;//입력
	}
	public int getPrice() {
		return price;//출력
	}
	public void setPrice(int price) {
		if(price <= 0) return; //종료
		this.price = price;//입력
	}  
}//class

public class Ch051Ex14 {
	public static void main(String[] args) {
		
	}//main
}//class
