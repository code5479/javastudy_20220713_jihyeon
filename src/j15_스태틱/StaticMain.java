package j15_스태틱;

public class StaticMain {
	
	public static void main(String[] args) {
		StaticTest.name = "김준일";			//static은 생성하지 않고 클래스명으로 바로  쓸 수있음.
		StaticTest.printTest();
		
		StaticTest staticTest = new StaticTest();
//		staticTest.name = "김준일";
		
		System.out.println(staticTest.name);
		StaticTest.printTest();
//		
//		StaticTest staticTest2 = new StaticTest();
//		staticTest2.name = "김준이";
//		System.out.println(staticTest2.name);
//		
//		System.out.println(staticTest.name);
		
		
		
		
		
	}

}
