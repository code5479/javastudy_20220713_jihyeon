package j16_제네릭;

public class GenericMain {

	public static void main(String[] args) {
		
		GenericTest<Integer, String> genericTest = new GenericTest<Integer, String>(); //생성하는 시점에 자료형을 선택해서 결정할 수 있음
		
		genericTest.setKey(100);
		genericTest.setValue("원");
		
		System.out.println(genericTest.getKey() + genericTest.getValue());
		
	}

}
