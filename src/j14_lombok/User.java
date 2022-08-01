package j14_lombok;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.experimental.NonFinal;

//@NoArgsConstructor			//raquiredargsconstructor 쓸때는 못씀
@RequiredArgsConstructor		//final , nonNull을 달아줄 때 쓰는 것
@AllArgsConstructor
public class User {
	

	private String email;		
	private String name;
	@NonNull									//값을 무조건 넣어줘야하는 것 null을 허용하지 않음  - Nonnull
	private String username;
	@NonNull
	private String password;
	

		
	
	

}
