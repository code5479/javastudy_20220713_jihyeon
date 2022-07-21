package j07_반복;

public class Continue1 {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				continue;  //조건에 맞으면 밑에를 실행하지 않고 다시 위로 올라감
			}
			System.out.println("i:" + i);
		}
	}

}
