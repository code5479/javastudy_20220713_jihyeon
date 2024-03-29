package j07_반복.복습;

public class BreakAndContinue {

	public static void main(String[] args) {
		String[] strArray = new String[] {"a", "b", null, null, "e", "f", null, "h"};
		
		for (int i = 0; i < strArray.length; i++) {
			if(strArray[i] == null) {
				continue;    			//계속 반복하라      break; - 반복을 멈춰라
			}
			System.out.println("i:" + i + " -> " + strArray[i]);
		}
	
		System.out.println();
		
		for(int i = 0; i < strArray.length; i++) {
			char a = strArray[0].charAt(0);
			if(strArray[i] == null) {
				strArray[i] = Character.toString((char)(a + i));
			}
			
			System.out.println("i:" + i + " -> " + strArray[i]);
		}
		
		for(String s : strArray) {
			System.out.println(s);
		}
		
	}

}
