package j11_상속.factory;

public class FactoryMain5 {

	public static void main(String[] args) {

		/*
		 * Factory Array 배열의 크기 20
		 * 
		 * 배열의 인덱스가 짝수이면 SamsungFactory 생성해서 대입 홀수이면 LgFactory 생성해서 대입
		 * 
		 * 삼성공장 1~10 LG공장 1~10
		 * 
		 * 모든 공장 가동 
		 * 모든 공장 생산 \\for문으로 묶기 
		 * 모든 공장 중지
		 * 
		 * 
		 */

		Factory Array[] = new Factory[20];
		
		for(int i = 0; i< Array.length; i++) {
			if(i % 2 == 0) {
				Array[i] = new SamsungFactory(i / 2+ 1);
			}else {
				Array[i] = new LgFactory(i / 2 + 1);
				
			}
		}
		
		for(int i = 0; i <Array.length; i++) {
			Array[i].start();
			if(Array[i] instanceof SamsungFactory) {
				((SamsungFactory) Array[i]).produceSmartPhone();
			}else {
				((LgFactory) Array[i]).produceSmartTv();
			}
			Array[i].stop();
			System.out.println();
		}
		



	}

}
