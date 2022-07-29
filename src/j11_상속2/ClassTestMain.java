package j11_상속2;

public class ClassTestMain {

	public static void main(String[] args) {
		
		((ClassA) new ClassB()).showData();    //아래랑 같은 방식 업캐스팅
		
		ClassB bb = new ClassB();				//업캐스팅
		ClassA aa = (ClassA) bb;				//(ClassA) 묵시적 형변환으로 지워줘도 됌
		
		((ClassA)bb).showData();				//업캐스팅
		((ClassA)bb).printInfo();
		
		ClassA aaa = new ClassB();
		
		
		
		ClassA b = new ClassB();                 // 앞 ClassB를 classA로 바꾸는 걸 업캐스팅
		b.printInfo();
		b.showData();
		
		              
		ClassA c = new ClassC();				// 앞 ClassB를 classA로 바꾸는 걸 업캐스팅
//		c.printInfo();      //자식이 부모의 printInfo를 받았기 때문에 출력가능
		c.printInfo();
		c.showData();
		
		
		
		
		
		
	}

}
