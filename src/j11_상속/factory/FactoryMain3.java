package j11_상속.factory;

public class FactoryMain3 {
	
	public static void main(String[] args) {
		
	
		//업캐스팅
		Factory[] factories = new Factory[4];
		factories[0] = new SamsungFactory(1);
		factories[1] = new LgFactory(1);
		factories[2] = new SamsungFactory(2);
		factories[3] = new LgFactory(2);
	
		int num = 10;
		
		SamsungFactory sfactory = new SamsungFactory(1);
		Factory f = sfactory;
		System.out.println(f);
		

		
		Factory factory = new Factory(1);                                   //업캐스팅 후 다운캐스팅을 해줘야함
		SamsungFactory samsungFactory = (SamsungFactory) factory;
		
	}

}
