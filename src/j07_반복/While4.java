package j07_반복;

public class While4 {

	public static void main(String[] args) {
		
		int dan = 2;
		int num = 0;
		int i = 0;
		
//		System.out.println(dan + " x " + num + " = " + (dan* num));
		
		/*
		 * 2 x 1 = 2
		 * 2 x 2 = 4
		 * ...
		 * 2 x 9 = 18
		 */
		while(i < 9) {
			num = i + 1;
			System.out.println(dan + " x " + num + " = " + (dan* num));
			i++;
		}
	}

}
