package j04_문자열;

public class String1 {

	public static void main(String[] args) {
		
		String address = "부산시 동래구 온천동";
		//문자열에서 해당 문자열의 값을 찾아 위치를 알려줌
		int index = address.indexOf("동");
		int index2 = address.lastIndexOf("동");
		System.out.println(index2);
		// 해당 문자열에서 범위를 지정하여 문자열을 잘라줌
		String subAddress = address.substring(address.indexOf("동"));
		String subAddress2 = address.substring(index, index2 + 1);
		System.out.println(index2);
		System.out.println(subAddress);
		System.out.println(subAddress2);

		//		해당 문자열을 찾아서 다른 문자열로 바꿔주는 기능
		String replaceAddress = address.replace(' ', '-');
		System.out.println(replaceAddress);
		replaceAddress = address.replaceAll(" ", "-");
		System.out.println(replaceAddress);
		
		String phoneNumbers = "010/1234/5679, 010/9876/5432";
		String rePhone = phoneNumbers.replaceAll("010", "011");
		rePhone = rePhone.replaceAll("/", "-");
		System.out.println(rePhone);
		rePhone = rePhone.replaceAll(", ", "/");
		System.out.println(rePhone);
		
		//split: 구분자를 지정해서 문자열을 잘라 배열로 반환
		//indexOf : 해당 문자열이 어느 위치에서 시작되는지 인덱스 값 반환
		//lastIndexOf : 뒤에서 부터 시작되는 인덱스 값 반환
		//substring : startIndex부터 endIndex 전까지 문자열을 잘라 문자열로 반환
		//replaceAll : 해당 문자열을 찾아 다른 문자열로 변환
		//toLowerCase,toUpperCase : 전부 소문자 또는 대문자로 변환
		//trim : 문자열의 양쪽 끝 공백을 제거해준다.
		//contains : 문자열에 해당 문자열이 포함되어 있는지 true, false 반환
		
	}

}
