package j03_연산자;

/*
 * 논리연산
 * 
 * AND연산(&&) - 곱
 * True && True => True
 * True && False => False
 * False && False => False
 * 
 * OR연산(||) - 합
 * True || True => True
 * True || False => True
 * False || False => False
 
 * NOT연산(!) - 부정
 * !True => False
 * !False => True
 * 
 * !(True && False) => True
 */

public class Operation2 {

	public static void main(String[] args) {
		
		boolean result = 10 != 5;
		boolean result2 = 10 == 10;
		
		System.out.println("" + result + result2);
		
		System.out.println(2000 % 4 == 0 && 2000 % 100 != 0 && 2000 % 5 == 0);
		

	}

}
