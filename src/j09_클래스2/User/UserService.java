package j09_클래스2.User;

import java.util.Scanner;

public class UserService {

	private Scanner scanner;
	private User[] UserArray;

	public UserService(User[] UserArray) {
		this.scanner = new Scanner(System.in);
		this.UserArray = UserArray;
	}

	private String inputSelect() {
		System.out.print("선택 : ");
		return scanner.nextLine();
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

		return new User(Username, password, name, email);

	}

	private User addUser() {
		for (int i = 0; i < UserArray.length; i++) {
			if (UserArray[i] != null) {
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
		System.out.println("2. User 조회");
		System.out.println("3. 종료");

		select = inputSelect();

		if (select.equals("1")) {
			User user = addUser();
			if (user != null) {

			}

		} else if (select.equals("2")) {
			while (showUserSearch())
				;
		} else if (select.equals("3")) {
			System.out.println("프로그램 종료");
			return false;
		} else {
			System.out.println("번호 입력 오류");
			System.out.println("재입력 하세요");
		}
		System.out.println();
		return true;

	}

	private boolean showUserSearch() {
		String select = null;

		System.out.println("[User 조회]");
		System.out.println("1. User 전체조회");
		System.out.println("2. User 검색조회");
		System.out.println("b. 뒤로가기");

		select = inputSelect();

		if (select.equals("1")) {
			showUserList();
		} else if (select.equals("2")) {
			showSearchUser();
		} else if (select.equals("b")) {
			System.out.println("뒤로돌아 갑니다.");
			return false;
		} else {

		}
		System.out.println();
		return true;

	}

	private void showUserList() {
		System.out.println("User 전체조회");
		System.out.println("UserName");
		for (int i = 0; i < UserArray.length; i++) {
			if (UserArray[i] != null) {
				System.out.println(UserArray[i].getUsername());
			}
		}
		System.out.println();
	}
	private void showSearchUser() {
		String SearchUser = null;
		System.out.println("User 검색");
		System.out.print("UserName : ");
		SearchUser = scanner.nextLine();
		
		User SearchUsername = searchUserbyUserName(SearchUser);
		if(SearchUsername != null) {
			System.out.println(SearchUsername.toString());
		}
		
		
	}
	private User searchUserbyUserName(String searchUser) {
		for(int i = 0; i<UserArray.length; i++) {
			if(UserArray[i] != null) {
				String UserName = UserArray[i].getUsername();
				if(searchUser.equals(UserName)) {
					return UserArray[i];
				}
			}
		}
		System.out.println("해당 UserName은 존재하지 않습니다.");
		return null;
		
	}
	
	
	
	
	
	
	
	
}
