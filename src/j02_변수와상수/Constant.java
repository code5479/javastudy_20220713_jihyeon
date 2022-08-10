package j02_변수와상수;

public class Constant {

	public static void main(String[] args) {
		
		final int MAX_NUMBER;						//자료형(일반자료형 - int, double, char, boolean, 참조자료형 - class)
		final int MIN_NUMBER = 0;					//변수 : 메모리 공간의 값을 바꿀 수 있는 것
													//변수 : 메모리 공간의 값을 바꿀 수 없는 것
		MAX_NUMBER = 100;
		
		
		
		int number = 10;
		number = 80;
		
		System.out.println("최소값: " + MIN_NUMBER);
		System.out.println("최대값: " + MAX_NUMBER);
		System.out.println("현재값: " + number);
		
	}
}
