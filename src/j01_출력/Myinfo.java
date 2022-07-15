package j01_출력;

public class Myinfo {

	public static void main(String[] args) {
		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';
		String name = "홍길동";
		int age = 30;
		
		String address = "부산 동래구 온천동";
			
		System.out.print("이름 : ");
		System.out.println("" + name1 + name2 + name3);
		System.out.print("나이 : ");
		System.out.println(age);
		System.out.print("주소 : ");
		System.out.println(address);
		System.out.println();
	}
}
