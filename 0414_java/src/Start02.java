
public class Start02 {

	public static void main(String[] args) {
		// args(argument) : ������ ��(String��) ������ ��� ��. 
		method1();
		method2(2,3);
		int data4 = method3(4,5);
		System.out.println(data4);
		
	}//main
	
	
	public static void method1() {
		// param ����, return ����. 
		//ex> �ð� - ��ȣ�ۿ��� ����. ���͸��� ������ ���� �˾Ƽ� ���ư�  
		System.out.println(1+1);
		
	} //method 1
	
	
	public static void method2(int data1, int data2) {
		// param �ְ�, return ����.
		// ex> ������ǰ(�����, ��ǳ��) - ���⸸ �ָ� ���ư�. 
		System.out.println(data1+data2);
		
	}//method 2
	
	
	public static int method3(int data1, int data2) {
		// param �ְ�, return �ְ�.
		// ��Ź�� - ���⸦ �ְ� ���ÿ�Ҹ� ������� ������. 
		int data3 = data1 + data2;
		return data3;
	}//method 3

}//class
