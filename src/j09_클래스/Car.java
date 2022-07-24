package j09_클래스;

public class Car {

	String company = null;
	String model = null;
	String color = null;
	
	
	Car() {
//		생성자는 무조건 주소값을 리턴한다., class명과 동일
		System.out.println("생성자 호출?");
	}
	
	
	void showCarInfo() {
		System.out.println("회사명 : " + company);
		System.out.println("모델명 : " + model);
		System.out.println("색상 : " + color);
		System.out.println();
	}
	
}
