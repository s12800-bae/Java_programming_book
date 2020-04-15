package book;

public class FuntionTest {

	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1,num2);
		System.out.println(num1 + "+" +num2 + "=" + sum +"입니다");
	}

	//매개 변수의 이름이 달라도 전혀 상관없음
	public static int add(int n1, int n2) {
		int result = n1+n2;
		return result;
	}
}
