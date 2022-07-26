package j09_클래스2.User;

import java.util.Scanner;

public class UserService {

	private Scanner scanner;
	private User[] UserArray;
	
	public UserService(User[] UserArray) {
		this.scanner = new Scanner(System.in);
		this.UserArray = UserArray;
	}
	
	
	private User inputUser() {
		String Username = null;
		int password = 0;
		String name = null;
		String email = null;
		
		System.out.println("User 등록");
		
		System.out.print("User Name : ");
		Username = scanner.nextLine();
		
		System.out.print("Password : ");
		password = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.print("Name : ");
		name = scanner.nextLine();
		
		System.out.print("Email : ");
		email = scanner.nextLine();
		
		return new User(Username,password,name,name);
		
	}
	
	private User addUser() {
		for (int i = 0; i<UserArray.length; i++) {
			if(UserArray[i] != null) {
				continue;
			}
			UserArray[i] = inputUser();
			System.out.println("[" + UserArray[i].getUsername() + "] 학생 등록 완료");
			return UserArray[i];
		}
			System.out.println("User 등록 불가");
			return null;
	}
	
	public boolean showmain() {
		String select = null;
		System.out.println("User 등록 시스템");
		System.out.println("1. User 등록");
		System.out.println("2. lIST 조회");
		System.out.println("3. 종료");
		System.out.print("선택 : ");
		
		select = scanner.nextLine();
		
		if(select.equals("1")) {
			User user = addUser();
			
		}else if(select.equals("2")) {
			
		}else if(select.equals("3")) {
			System.out.println("프로그램 종료");
			return false;
		}else {
			System.out.println("번호 입력 오류");
			System.out.println("재입력 하세요");
		}
		System.out.println();
		return true;
		
	}
	
	
	
	
}
