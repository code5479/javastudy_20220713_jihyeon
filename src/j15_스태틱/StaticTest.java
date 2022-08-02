package j15_스태틱;

public class StaticTest {
	
	public static String name;		//static은 무조건 public	
	private int age;
	
	
	public static void printTest() {		//static 끼리만 쓸수있음
		System.out.println("출력");
		System.out.println(name);
	}
	
}
