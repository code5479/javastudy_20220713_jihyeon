package j09_클래스2.User;

public class UserMain {

	/*
	 * 사용자 정보 시스템
	 * username(사용자 이름)
	 * password(비밀번호)
	 * name(이름)
	 * email(이메일)
	 * 
	 * User
	 * UserService
	 */
	
	public static void main(String[] args) {
		
		int usercount = 2;
		
		User[] UserArray = new User[usercount];
		
		UserService service =new UserService(UserArray);
		
		while(service.showmain()) {
		}
		System.out.println("프로그램 종료");
		
	}
	
	
	
}
