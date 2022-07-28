package j12_다형성.factory;

import j11_상속.factory.Factory;

public class FactoryService {
	
	
	private Factory factory;
	
	public FactoryService(Factory factory) {		//DI 의존성 주입
		this.factory = factory;
	}

	public void factoryStart() {
		factory.start();
	}
	
	public void factoryStop() {
		factory.stop();
	}


	public void setFactory(Factory factory) {
		this.factory = factory;
	}
	
	
		
}
