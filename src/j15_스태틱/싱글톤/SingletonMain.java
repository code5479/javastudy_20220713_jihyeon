package j15_스태틱.싱글톤;

public class SingletonMain {
	
	public static void main(String[] args) {
		
		KIA kia = KIA.getInstace();
		KIA kia2 = KIA.getInstace();
		KIA kia3 = KIA.getInstace();
		KIA kia4 = KIA.getInstace();
		KIA kia5 = KIA.getInstace();
		KIA kia6 = KIA.getInstace();
		
//		System.out.println(kia);
//		System.out.println(kia2);			//전부 주소 같아짐
//		System.out.println(kia3);
//		System.out.println(kia4);
//		System.out.println(kia5);
//		System.out.println(kia6);
		
		System.out.println(kia.produceCar("k3")); 
		System.out.println(kia2.produceCar("k5")); 	//다른변수지만 동일하게 carNumber가 올라감
		System.out.println(kia3.produceCar("k7")); 
		System.out.println(kia4.produceCar("k8")); 
		System.out.println(kia5.produceCar("k9")); 
		
		Test1 test1 = new Test1();
		Test2 test2 = new Test2();				//3개다 주소가 같음 
		Test3 test3 = new Test3();
		
	}

}
