package j19_익명클래스.role;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;

import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class PrincipalDetailse {
	
	@NonNull
	private User user;
	
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
		
		List<String> roleList = user.getRoleList();
		
		for(String role : roleList) {
			GrantedAuthority grantedAuthority = new GrantedAuthority() {
				
				@Override
				public String getAuthority() {									//바꾼게 밑에꺼 
					return role;
				}
			};
				authorities.add(grantedAuthority);
			
		}
		
		String role = ((List<GrantedAuthority>)authorities).get(0).getAuthority();
		

		
		user.getRoleList().forEach(r -> {
			authorities.add(() -> r);
		});
		
		return authorities;
	}
	
	public String getUsername() {
		return user.getUsername();
	}
	
	public String getPassword() {
		return user.getPassword();
	}
	
	
//	public static void main(String[] args) {
//		
//		String strRoles = "USER_ROLE,ADMIN_ROLE,MANAGER_ROLE";
//		
//		//공백을 제거
//		//strRoles = strRoles.replace(" ", "");    밑에 방식이 한번에 가능
//		
//		//쉼표로 자르기 -> 배열로
//		String[] roleArray = strRoles.replace(" ", "").split(",");
//		
////		for(String role : roleArray) {
////			System.out.println(role);    출력해보기
////		}
//		
//		List<String> roles = new ArrayList<String>();
//		roles.addAll(Arrays.asList(roleArray));
//		
//		System.out.println(roles);
//		
//		Collection<String> roleDatas = new GrantedAuthority() {
//			
//			@Override
//			public Collection<String> getRoles(List<String> roles) {
//				List<String> roleList = new ArrayList<String>();
//				roles.addAll(roles);
//				return roleList;
//			}
//		}.getRoles(roles);
//		
//		System.out.println(roles);
//		
//	}

}
