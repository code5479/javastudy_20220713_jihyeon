package j11_상속2;

public class ClassTestMain2 {

	public static void main(String[] args) {
		
		int num = 10;
		int [] numbers = new int[2];
		numbers[0] = num;
		System.out.println(numbers[0]);
		
		ClassA b = new ClassB();
		ClassA[] arrayA = new ClassA[2];
		arrayA[0] = b;								//주소가 들어가 있기 때문에 배열에 참조가 가능
		arrayA[1] = new ClassC();					//변수명 입력없이 바로 배열에 넣기 가능
		
		arrayA[0].printInfo();
		arrayA[1].printInfo();
		
		for(int i = 0; i< arrayA.length; i++) {
			arrayA[i].printInfo();
			// B.printInfo();
			// C.printInfo();
		}
		
		ClassB b2 = (ClassB) arrayA[0];					//다운캐스팅 명시적 형변환 (ClassB) 생략불가
		
		
		
		
		if(arrayA[0] instanceof ClassB) {				//의미가 원래 클래스 B였니 의미 [1]을 찍으면 B가 아님 원래는 C임
			System.out.println("클래스 B였음");
		}else {
			System.out.println("클래스 B가 아님");
		}
	
		for(int i = 0; i<arrayA.length; i++) {
			if(arrayA[i] instanceof ClassB) {
				ClassB b3 =(ClassB) arrayA[i];
				b3.addData();
			}else if(arrayA[i] instanceof ClassC) {
				ClassC c3 = (ClassC) arrayA[i];
				c3.removeData();
			}else {
				System.out.println("다운캐스팅 불가");
			}
		}
	
	
	
	
	}
	

}
