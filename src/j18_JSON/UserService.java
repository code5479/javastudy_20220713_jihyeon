package j18_JSON;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
	
	
	
	public static User createUser() {
		List<String> hobby = new ArrayList<String>();
		hobby.addAll(Arrays.asList(new String[] {"축구", "농구", "야구", "골프"}));
		
		User user = User.builder()
				.user_code(1)
				.username("junil")
				.password("1234")
				.name("김준일")
				.email("skj1234@kakao.com")
				.address("부산 동래구 사직동")
				.phone("010-1234-5479")
				.hobby(hobby)
				.build();
		return user;
	}

}
