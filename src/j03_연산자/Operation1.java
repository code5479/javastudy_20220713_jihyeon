package j03_연산자;

public class Operation1 {
	
	public static void main(String[] args) {
		
		int num = 50;
		
		System.out.println(++num); //선증가 : 바로 1 증가시킴
		System.out.println(num);
		System.out.println(num++); //후증가 : 다음번째 1 증가시킴
		System.out.println(num);
		System.out.println(--num); //선감소 : 바로 1 감소시킴
		System.out.println(num);
		System.out.println(num--); //후감소 : 다음번째 1 감소시킴
		System.out.println(num);
		
		
	}

}
