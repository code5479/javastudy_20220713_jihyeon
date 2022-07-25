package j11_상속.factory;

public class LgFactory extends Factory {
	
	public LgFactory(int factoryNumber) {
		super(factoryNumber);
	}
	
	@Override
	public void start() {
		System.out.println("LG");
		super.start();
	}
	
	@Override
	public void stop() {
		System.out.println("LG");
		super.stop();
	}
	
	

	public void produceSmartTv() {
		System.out.println("LG스마트 TV를 생산합니다.");
	}
	
}
