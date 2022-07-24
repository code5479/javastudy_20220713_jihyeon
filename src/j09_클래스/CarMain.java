package j09_클래스;

/*
 * 클래스 Car
 * 변수
 * 		company
 * 		model
 * 		color
 * 
 * 메소드
 * 		showCarInfo()
 * 			회사명: 000
 * 			모델명: 000
 * 			색상 :  000
 * 
 * 3대	
 * 현대자동차		기아차		현대자동차
 * 소나타			k5			아반떼
 * 화이트			블랙		그레이
 * 
 */

public class CarMain {
	
	public static void main(String[] args) {
		
		Car a1 = new Car();
		Car a2 = new Car();
		Car a3 = new Car();
		
		a1.company = "현대자동차";
		a1.model = "소나타";
		a1.color = "화이트";
		
		a2.company = "기아차";
		a2.model = "K5";
		a2.color = "블랙";
		
		a3.company = "현대자동차";
		a3.model = "아반떼";
		a3.color = "그레이";
		
		a1.showCarInfo();
		a2.showCarInfo();
		a3.showCarInfo();
		
		
	}

}
