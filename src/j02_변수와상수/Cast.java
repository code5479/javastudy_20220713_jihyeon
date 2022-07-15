package j02_변수와상수;

public class Cast {

	public static void main(String[] args) {
		
		char a = '가';
		int b = a;
		double c = b;
		
		
		System.out.println(b);
		System.out.println(c);
		
		int d =(int) c;
//		문자-정수-실수 순서(오른쪽으로 갈수록 커짐), 업캐스팅은 선언필수 할 필요없으니 다운캐스팅은 선언필수 단 문자에서 바로 실수는 불가 
		char e = (char) d; 
		
		System.out.println(d);
		System.out.println(e);
		
		
		

	}

}
