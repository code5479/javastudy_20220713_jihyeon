package j07_반복;

public class Continue2 {

	public static void main(String[] args) {
		
		String address = "부산 동래구 사직동 중아대로";
		String tempaddress = null;
		
		for(int i = 0; i < address.length(); i++) {
			String subaddress = address.substring(i,i+1);
			if(subaddress.equals(" ")) {
				continue;
			}
			if(i == 0) {
				tempaddress = subaddress;
			}else {
				tempaddress += subaddress;
			}
		
		}
		
		System.out.println(tempaddress);

	}

}
