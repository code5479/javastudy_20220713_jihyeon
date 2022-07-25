package j10_배열;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		/*
		 *  배열 선언과 초기화
		 */

		
		
		//		정수 배열
		int[] numbers = new int[5];
		
//		문자열 배열
		String[] strArray = new String[5];
		
//		객체 배열
		Scanner[] scanArray = new Scanner[5];   //공간만 만들어진거지 객체가 만들어진건 아님 즉 Scanner s = new Scanner(system.in); 객체를 만들수있게 해야함.
		
		/*
		 * 배열에 값 추가
		 */
		
		numbers[0] = 10;
		numbers[1] = 20;
		
		strArray[4] = "문자열";
		
		scanArray[0] = new Scanner(System.in);
		

	}

}
