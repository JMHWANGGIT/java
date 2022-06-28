
public class Start02 {

	public static void main(String[] args) {
		// args(argument) : 들어오는 값(String형) 가지고 노는 값. 
		method1();
		method2(2,3);
		int data4 = method3(4,5);
		System.out.println(data4);
		
	}//main
	
	
	public static void method1() {
		// param 없고, return 없고. 
		//ex> 시계 - 상호작용이 없음. 배터리만 있으면 지가 알아서 돌아감  
		System.out.println(1+1);
		
	} //method 1
	
	
	public static void method2(int data1, int data2) {
		// param 있고, return 없고.
		// ex> 가전제품(냉장고, 선풍기) - 전기만 주면 돌아감. 
		System.out.println(data1+data2);
		
	}//method 2
	
	
	public static int method3(int data1, int data2) {
		// param 있고, return 있고.
		// 세탁기 - 전기를 주고 선택요소를 맞춰줘야 굴러감. 
		int data3 = data1 + data2;
		return data3;
	}//method 3

}//class
