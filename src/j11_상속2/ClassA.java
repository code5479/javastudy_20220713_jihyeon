package j11_상속2;

public abstract class ClassA {      //abstract 틀로만 쓰겠다. 상속불가 구현만 가능
	
	public ClassA() {
		System.out.println("부모 클래스 생성자 호출");
	}
	
	public void printInfo() {
		System.out.println("부모의 정보를 출력");
		System.out.println();
	}
	
	
	public abstract void showData();

}
