package j15_스태틱;

public class MainStaticTest {
	
	public static void printTest() {		//main도 static이라서 출력가능
		System.out.println("출력");
	}
	
	public void printTest2() {				//객체 생성필요
		System.err.println("출력2");
	}
	
	
	public static void main(String[] args) {
		
		printTest();
		
		MainStaticTest mainStaticTest = new MainStaticTest();		//객체생성
		mainStaticTest.printTest2();
	}

}
